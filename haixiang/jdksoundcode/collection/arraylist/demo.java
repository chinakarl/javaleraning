package jdksoundcode.collection.arraylist;

import java.util.*;

public class demo {
    public static void main (String[] args)
    {
        List<Integer> arrayList = new ArrayList();
        for (int i=0;i<10000000;i++)
        {
            arrayList.add(i);
        }
        Iterator iterator = arrayList.iterator();
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        while (iterator.hasNext())
        {
            iterator.next();
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iterator：" + interval+" ms");

        startTime = System.currentTimeMillis();
        for (int i=0;i<arrayList.size();i++)
        {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("RandomAccess：" + (endTime - startTime)+" ms");
        startTime = System.currentTimeMillis();
        for (Integer str : arrayList)
        {
            //String string = str;
            //System.out.println(str);
        }
        endTime = System.currentTimeMillis();
        System.out.println("for：" + (endTime - startTime)+" ms");
    }

}
