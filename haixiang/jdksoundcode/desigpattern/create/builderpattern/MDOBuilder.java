package jdksoundcode.desigpattern.create.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public class MDOBuilder extends CarBuilder{

    MDOModel mdoModel = new MDOModel();

    @Override
    public void setSequence(List<String> sequence)
    {
        mdoModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel()
    {
        return mdoModel;
    }

}
