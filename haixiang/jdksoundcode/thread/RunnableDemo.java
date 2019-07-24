package jdksoundcode.thread;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/6/10
 */


public class RunnableDemo {


    public static void main(String [] args)
    {
//        Thread thread1 = new ThreadTest();
//        Thread thread2 = new ThreadTest();
//        Thread thread3 = new ThreadTest();
//        thread1.start();
//        thread2.start();
//        thread3.start();

//        RunnableTest Runnable1 = new RunnableTest();
//        SynRunTest Runnable1 = new SynRunTest();
//        Thread thread6 = new Thread(Runnable1);
//        Thread thread4 = new Thread(Runnable1);
//        Thread thread5 = new Thread(Runnable1);
//        thread6.start();
//        thread4.start();
//        thread5.start();


//        ThreadA t1 = new ThreadA("t1");
//        synchronized(t1) {
//            try {
//                // 启动“线程t1”
//                System.out.println(Thread.currentThread().getName()+" start t1");
//                t1.start();
//
//                // 主线程等待t1通过notify()唤醒。
//                System.out.println(Thread.currentThread().getName()+" wait()");
//                t1.wait();
//
//                System.out.println(Thread.currentThread().getName()+" continue");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new Runnable() {
//                public void run() {
//                    System.out.println("threadName:"+Thread.currentThread().getName());
//                }
//            });
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        Thread mythread=new MyThread("mythread");
         System.out.println(Thread.currentThread().getName()+" call mythread.run()");
         mythread.run();
         System.out.println(Thread.currentThread().getName()+" call mythread.start()");
         mythread.start();
    }
}

class ThreadTest extends Thread
{
    private int ticket=10;
    public void run()
    {
        for (int i=0;i<10;i++)
        {
        if(this.ticket>0){
            System.out.println(this.getName()+" 卖票：ticket"+this.ticket--);
        }
        }
    }
}

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}

class RunnableTest implements Runnable
{
    private int ticket=10;
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            if(this.ticket>0){
                System.out.println(Thread.currentThread().getName()+" 卖票：ticket"+this.ticket--);
            }
        }
    }
}

class SynRunTest implements Runnable
{
    public void run()
    {
        synchronized (this)
        {
            try {
                for (int i=0;i<10;i++)
                {
                    Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+" 卖票：ticket"+i);
                }

            }catch (InterruptedException ie)
            {

            }

        }
    }
}

// WaitTest.java的源码
class ThreadA extends Thread{

    public ThreadA(String name) {
        super(name);
    }

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+" call notify()");
            // 唤醒当前的wait线程
            notify();
        }
    }
}
