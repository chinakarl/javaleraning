package jdksoundcode.thread;

/**
 * @author: zhaihx
 * @description: 等待与唤醒
 * @date:2019/7/10
 */
public class WaitAndNotify {

    public static void main(String [] args)
    {
        ThreadA1 threadA = new ThreadA1();
        threadA.run();
    }

}
class ThreadA1 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}