package jdksoundcode.desigpattern.create.builderpattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public class BMWModel extends CarModel {

    /**
     * 启动
     */
    public void start()
    {
        System.out.println("宝马启动");
    }

    /**
     * 停止
     */
    public void stop()
    {
        System.out.println("宝马停止");
    }

    /**
     * 喇叭
     */
    public void alarm()
    {
        System.out.println("宝马喇叭声音");
    }

    /**
     * 引擎
     */
    public void engineBoom()
    {
        System.out.println("宝马引擎发动");
    }

}
