package com.company;

//import system.io.*;
//test9998888
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.company.Benny.*;

import java.text.Format;
class test{

    int calc(int x,int y)
    {
        return x+y;
    }
}
public class Main {

    public static void main(String[] args) throws IOException{
//        TESTFUN();
//        trycatch();
        //test1 a1=new test1();
        //IOTest a2=new IOTest();
//        LoadPict a2=new LoadPict();
//        DrawPic a3=new DrawPic();
      //  But1 a4=new But1();
        //a1.TestThread();
//        a2.filewrite();
//        a2.fileread();
//MSDB a1=new MSDB();
//        a1.ConDb1();

        dispmsg("555666!");
        dispmsg("Good!");
        dispmsg("Done!");
    }

    public static void trycatch()
    {
        try {
            int a;
            a=2/0;
        }
        catch(Exception E) {

        dispmsg(E.toString());
    }
            finally{
            dispmsg("測試");
        }



    }
    public static void testfun()
{
    // write your code here
    int i;
    test s1;
    test1 s2=new test1();

    s1=new test();
//        for(i=0;i<10;i++)
//        System.out.println("test"+i);
    disprand();
    dispmsg("Over!");
    dispmatrix();
//        dispmsg(readmsg());
    //System.out.println(s1.calc(2,3));
    dispmsg(Integer.toString(s1.calc(6,7)));
    s2.Dispwelcome();

}

    public static void disprand(){
        for(int i=0;i<10;i++)
        {
            System.out.println((int)Math.floor(Math.random() * 10));
        }
    }
    public static void dispmatrix(){
    String[] a={"aa","bb"};
    int i;
    for(i=0;i<a.length;i++ ) System.out.println(a[i]);

}

    public static void dispmsg(String s1) {
        System.out.println(s1);

    }
    public static String readmsg() throws IOException{
        BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
        return keyin.readLine();


    }




}

