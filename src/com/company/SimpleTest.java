package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by blin on 2014/12/30.
 */
public class SimpleTest {
    public static void main(String[] args){
        int i;
        ArrayList a1=new ArrayList();

        a1.add(new Integer(1));
        a1.add(new Integer(2));
        a1.add(new Integer(3));
        Object ia[] = a1.toArray();

            for(i=0;i<a1.size();i++) System.out.println(((Integer) ia[i]).intValue());


            System.out.println("1122233111");


//        System.getProperties().list(System.out);

    }
}
