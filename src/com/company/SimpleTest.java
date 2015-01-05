package com.company;

import sun.misc.Sort;

import java.lang.reflect.Array;
import java.security.KeyException;
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
    public static void InputTest() throws IOException{
        String a1;
        BufferedReader keyin = new BufferedReader(
                new InputStreamReader(System.in));

        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());



        do {

            System.out.println("1:11111");
            System.out.println("2:21111");
            System.out.println("3:Exit");
            System.out.println("Please input choose:");
            a1=keyin.readLine();
            switch (Integer.parseInt(a1)){
                case 1:
                    System.out.println("You select 1");
                    break;
                case 2:
                    System.out.println("You select 2");
                    break;
                case 3:
                    System.out.println("You select 3");
                    break;
            }
        }while (Integer.parseInt(a1)!=3);
        System.out.println("Over!");
    }

    public static void main(String[] args) throws IOException  {
//       SortTest();
        InputTest();
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
