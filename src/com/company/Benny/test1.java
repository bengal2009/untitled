package com.company.Benny;

/**
 * Created by blin on 2014/12/22.
 */
class addThread1 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("執行緒 3    累加 2 → " + 2 * i);
            try {
                Thread.sleep((long)(1000 * Math.random()));
            }
            catch(InterruptedException e) {}
        }
    }
}

class addThread2 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("執行緒 7    累加 5 → " + 10 * i);
            try {
                Thread.sleep((long)(1000 * Math.random()));
            }
            catch(InterruptedException e) {}
        }
    }
}

class addThread implements Runnable {
    private String thread_n;
    private int num;
    addThread(String name, int n) {
        thread_n = name;
        num = n;
    }
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(thread_n + "    累加 " + num +" → "+ num * i);
            try {
                Thread.sleep((long)(1000 * Math.random()));
            }
            catch(InterruptedException e) {}
        }
    }
}

public class test1 {
    public void Dispwelcome()
    {
        System.out.println("Welcome");
    }
    public static void TestThread () {
        addThread thread1 = new addThread("執行緒 1", 2);
        addThread thread2 = new addThread("執行緒 2", 5);
        addThread2 t3=new addThread2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

//        t1.start();
        t2.start();
        t3.start();
    }

}




