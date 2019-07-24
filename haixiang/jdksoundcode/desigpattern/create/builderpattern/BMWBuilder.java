package jdksoundcode.desigpattern.create.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public class BMWBuilder extends CarBuilder {
    BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(List<String> sequence)
    {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel()
    {
        return bmwModel;
    }
}
