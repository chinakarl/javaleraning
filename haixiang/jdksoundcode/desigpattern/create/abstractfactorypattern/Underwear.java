package jdksoundcode.desigpattern.create.abstractfactorypattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/16
 */
public class Underwear implements IClothing {

    public void start()
    {
        System.out.println("正在制作内衣...");
    }
    public void colour()
    {
        System.out.println("给内衣上色...");
    }
    public void pack()
    {
        System.out.println("内衣制作完包装...");
    }
}
