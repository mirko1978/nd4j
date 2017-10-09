package org.nd4j.linalg.api.ops.impl.transforms.convolution;

import lombok.extern.slf4j.Slf4j;
import org.nd4j.autodiff.ArrayField;
import org.nd4j.autodiff.functions.DifferentialFunction;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.linalg.api.ndarray.INDArray;

import java.util.List;


/**
 * Pooling2DDerivative operation
 */
@Slf4j
public class Pooling2DDerivative extends Pooling2D {


    public Pooling2DDerivative(SameDiff sameDiff, DifferentialFunction[] inputs, boolean inPlace, int kh, int kw, int sy, int sx, int ph, int pw, int dh, int dw, Pooling2DType type, boolean isSameMode) {
        super(sameDiff, inputs, inPlace, kh, kw, sy, sx, ph, pw, dh, dw, type, isSameMode);
    }

    public Pooling2DDerivative(INDArray[] inputs, INDArray[] outputs, int kh, int kw, int sy, int sx, int ph, int pw, int dh, int dw, Pooling2DType type, boolean isSameMode) {
        super(inputs, outputs, kh, kw, sy, sx, ph, pw, dh, dw, type, isSameMode);
    }

    public Pooling2DDerivative() {}


    @Override
    public String opName() {
         return super.opName() + "_bp";
    }


    @Override
    public ArrayField doGetValue() {
        return null;
    }

    @Override
    public List<DifferentialFunction> doDiff(List<DifferentialFunction> f1) {
        return null;
    }

}