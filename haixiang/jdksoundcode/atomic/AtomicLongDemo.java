package jdksoundcode.atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/10
 */
public class AtomicLongDemo {

    public static void main(String [] args)
    {
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.set(10L);
        System.out.println(atomicLong.get());
    }
}
