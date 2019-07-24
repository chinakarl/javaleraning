package jdksoundcode.desigpattern.create.simplefactorypattern;

/**
 * @author: zhaihx
 * @description: 简单工厂
 * @date:2019/7/10
 */
public class Client {

    public static void main(String [] args)
    {
        IClothing underwear = ClothingFactory.createClothing(Underwear.class);
        underwear.start();
        underwear.colour();
        underwear.pack();
        IClothing coat = ClothingFactory.createClothing(Coat.class);
        coat.start();
        coat.colour();
        coat.pack();
        IClothing trousers = ClothingFactory.createClothing(Trousers.class);
        trousers.start();
        trousers.colour();
        trousers.pack();
    }
}

