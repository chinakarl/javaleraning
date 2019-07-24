package jdksoundcode.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class threadDemo {
    public static  void main(String[] args) throws InterruptedException
    {
        final List<Integer> integers = new ArrayList<Integer>();
        new Thread(new Runnable() {
            public void run() {
                for (int i=0;i<10;i++)
                {
                    try {
                        integers.add(i);
                        Thread.sleep(1);
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {

                for (int i=10;i<20;i++)
                {
                    try {
                        integers.add(i);
                        Thread.sleep(1);
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(1000);
        // 打印所有结果
        for (int i = 0; i < integers.size(); i++) {
            System.out.println("第" + (i + 1) + "个元素为：" + integers.get(i));
        }
    }
}
