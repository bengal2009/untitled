package com.company;

import sun.misc.Sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
/**
 * Created by blin on 2014/12/30.
 */
public class SimpleTest {
    public static void SortTest() {
        int[] a1 = {1, 2, 3, 5, 4};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        System.out.println("Start Sort");
        Arrays.sort(a1);
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }

    public static void main(String[] args) throws IOException  {
       SortTest();
      /*  int[] a1=new int[5];
        BufferedReader keyin = new BufferedReader(
                new InputStreamReader(System.in));
        for(int i=0;i<a1.length;i++) {
            System.out.println("Keyin..");
            System.out.println(12);
            try {

                a1[i]=Integer.parseInt(keyin.readLine());
            }
            catch (Exception E){
                System.out.println(E.toString());

            }
        }
        System.out.println("Hello");*/


           /* int i;
        ArrayList a1=new ArrayList();

        a1.add(new Integer(1));
        a1.add(new Integer(2));
        a1.add(new Integer(3));
        Object ia[] = a1.toArray();

            for(i=0;i<a1.size();i++) System.out.println(((Integer) ia[i]).intValue());


            System.out.println("1122233111");


//        System.getProperties().list(System.out);
*/

    }
}
