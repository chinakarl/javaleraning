package jdksoundcode.desigpattern.create.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public abstract class CarBuilder {
    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
