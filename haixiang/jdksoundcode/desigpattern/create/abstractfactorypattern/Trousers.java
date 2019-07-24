package jdksoundcode.desigpattern.create.abstractfactorypattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/16
 */
public class Trousers  implements IClothing {

    public void start()
    {
        System.out.println("正在制作裤子...");
    }
    public void colour()
    {
        System.out.println("给裤子上色...");
    }
    public void pack()
    {
        System.out.println("裤子制作完包装...");
    }

}
