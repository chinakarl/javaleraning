package jdksoundcode.desigpattern.create.abstractfactorypattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/16
 */
public class Coat implements IClothing {

    public void start()
    {
        System.out.println("正在制作外套...");
    }
    public void colour()
    {
        System.out.println("给外套上色...");
    }
    public void pack()
    {
        System.out.println("外套制作完包装...");
    }

}
