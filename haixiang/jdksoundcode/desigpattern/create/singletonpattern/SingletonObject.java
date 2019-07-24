package jdksoundcode.desigpattern.create.singletonpattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/22
 */
public class SingletonObject {
    private SingletonObject singletonObject = new SingletonObject();

    public SingletonObject getInstance()
    {
        return  singletonObject;
    }
}
