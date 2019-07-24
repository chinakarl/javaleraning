package jdksoundcode.desigpattern.behavior.templatepattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/18
 */
public class Client {

    public static void main(String [] args)
    {
        BungalowHouse bungalowHouse = new BungalowHouse();
        bungalowHouse.buildHouse();

        GlassHouse glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }

}
