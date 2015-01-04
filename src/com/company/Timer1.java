package com.company;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

/**
 * Created by blin on 2015/1/4.
 */


    public class Timer1 extends TimerTask {
    int i = 1;

    //此方法要覆寫
    //想要定時執行的工作寫在該method中
    public void run(){
        System.out.println("Hello World! " + i);
        i++;
    }

    public static void main(String[] args) {
        Timer t1=new Timer();
        t1.schedule(new Timer1(),0,1000);
    }
    }

