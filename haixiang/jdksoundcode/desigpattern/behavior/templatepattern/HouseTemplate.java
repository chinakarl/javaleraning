package jdksoundcode.desigpattern.behavior.templatepattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/18
 */
public abstract class HouseTemplate {

    public void buildHouse()
    {
        this.buildWalls();
        this.buildPillars();
    }
    public abstract void buildWalls();
    public abstract void buildPillars();
}
