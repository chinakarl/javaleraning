package jdksoundcode.desigpattern.create.builderpattern;

import java.util.ArrayList;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList();
    MDOBuilder mdoBuilder = new MDOBuilder();
    BMWBuilder bmwBuilder = new BMWBuilder();

    public void getAMdoModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        mdoBuilder.setSequence(this.sequence);
        mdoBuilder.getCarModel().run();
    }

    public void getBMdoModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        mdoBuilder.setSequence(this.sequence);
        mdoBuilder.getCarModel().run();
    }

    public void getABmwModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.sequence.add("engineboom");
        bmwBuilder.setSequence(this.sequence);
        bmwBuilder.getCarModel().run();
    }

    public void getBBmwModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        bmwBuilder.setSequence(this.sequence);
        bmwBuilder.getCarModel().run();
    }
}
