package jdksoundcode.desigpattern.create.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public class Demo {

    public static void main(String [] args)
    {
        List<String> sequence = new ArrayList<String>();
        sequence.add("engineboom");
        sequence.add("start");
        sequence.add("stop");
        BMWModel bmwModel = new BMWModel();
        bmwModel.setSequence(sequence);
        bmwModel.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        bmwBuilder.getCarModel().run();

        MDOBuilder mdoBuilder = new MDOBuilder();
        mdoBuilder.setSequence(sequence);
        mdoBuilder.getCarModel().run();

        Director director = new Director();
        director.getABmwModel();
        director.getBBmwModel();
        director.getAMdoModel();
        director.getBMdoModel();
    }

}
