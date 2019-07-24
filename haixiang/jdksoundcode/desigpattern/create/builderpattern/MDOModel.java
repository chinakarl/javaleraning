package jdksoundcode.desigpattern.create.builderpattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public class MDOModel extends CarModel {

    /**
     * 启动
     */
    public void start()
    {
        System.out.println("蒙迪欧启动");
    }

    /**
     * 停止
     */
    public void stop()
    {
        System.out.println("蒙迪欧停止");
    }

    /**
     * 喇叭
     */
    public void alarm()
    {
        System.out.println("蒙迪欧喇叭声音");
    }

    /**
     * 引擎
     */
    public void engineBoom()
    {
        System.out.println("蒙迪欧引擎发动");
    }
}
