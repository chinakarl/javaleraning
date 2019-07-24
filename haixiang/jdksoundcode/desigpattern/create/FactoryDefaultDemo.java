package jdksoundcode.desigpattern.create;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/10
 */
public class FactoryDefaultDemo {

    public static void main(String [] args)
    {
        Car car = new Car();
        car.start();
        car.run();
        car.stop();
        Train train = new Train();
        train.start();
        train.run();
        train.stop();
        Plane plane = new Plane();
        plane.start();
        plane.run();
        plane.stop();
    }
}

/**
 *  交通工具类
 */
interface ITraffic
{
    /**
     * 跑
     */
    void run();
    /**
     * 启动
     */
    void start();
    /**
     * 停止
     */
    void stop();
}

/**
 *  汽车类
 */
class Car implements ITraffic
{
    public void run()
    {
        System.out.println("汽车在跑");
    }
    public void start()
    {
        System.out.println("汽车启动");
    }
    public void stop()
    {
        System.out.println("汽车停下");
    }
}
/**
 *  火车类
 */
class Train implements ITraffic
{
    public void run()
    {
        System.out.println("火车在跑");
    }
    public void start()
    {
        System.out.println("火车启动");
    }
    public void stop()
    {
        System.out.println("火车停下");
    }
}
/**
 *  飞机类
 */
class Plane implements ITraffic
{
    public void run()
    {
        System.out.println("飞机在跑");
    }
    public void start()
    {
        System.out.println("飞机启动");
    }
    public void stop()
    {
        System.out.println("飞机停下");
    }
}