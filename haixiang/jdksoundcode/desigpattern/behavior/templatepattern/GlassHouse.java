package jdksoundcode.desigpattern.behavior.templatepattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/18
 */
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls()
    {
        System.out.println("正在建造玻璃房墙壁...");
    }
    @Override
    public  void buildPillars()
    {
        System.out.println("正在建造玻璃房柱子...");
    }
}
