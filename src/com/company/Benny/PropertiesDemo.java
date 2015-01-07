package com.company.Benny;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by blin on 2015/1/7.
 */
public class PropertiesDemo {
    public static void main(String args[])
     {
       Properties capitals = new Properties();
       Set states;
       String str;
       capitals.put("中国", "北京");
       capitals.put("俄罗斯", "莫斯科");
       capitals.put("日本", "东京");
       capitals.put("法国", "巴黎");
         capitals.put("英国", "伦敦");

         // 返回包含映射中项的集合
         states = capitals.keySet();
         Iterator itr = states.iterator();
         while (itr.hasNext())
            {
            str = (String) itr.next();
            System.out.println("国家：" + str + " ，首都： "+ capitals.getProperty(str) + ".");
            }
        System.out.println();
        // 查找列表，如果没有则显示为“没发现”
        str = capitals.getProperty("美国", "没有发现");
        System.out.println("美国的首都：" + str + ".");
        }
    }
