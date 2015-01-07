package com.company.Benny;
import java.util.*;
/**
 * Created by blin on 2015/1/7.
 */
 class MyComp implements Comparator
 {
       public int compare(Object o1, Object o2)
       {
       String aStr, bStr;
       aStr = (String)o1;
       bStr = (String)o2;
       return bStr.compareTo(aStr);
         //  return aStr.compareTo(bStr);
       }
       }
public class ComparatorDemo {
    public static void main(String args[])
     {
       // 创建一个TreeSet对象
       TreeSet ts = new TreeSet(new MyComp());
       // 向TreeSet对象中加入内容
       ts.add("C");
       ts.add("A");
       ts.add("B");
       ts.add("E");
       ts.add("F");
       ts.add("D");
       // 得到Iterator的实例化对象
       Iterator i = ts.iterator();
       // 显示全部内容
       while (i.hasNext())
         {
            Object element = i.next();
            System.out.print(element + " ");
            }
        }

}
