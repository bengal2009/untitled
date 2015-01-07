package com.company.FileIO;
import java.io.*;
/**
 * Created by blin on 2015/1/7.
 */
public class PipeStream {
     public static void main(String args[])
     {
     try  {
             Sender sender = new Sender(); // 产生两个线程对象
             Receiver receiver = new Receiver();
             PipedOutputStream out = sender.getOutputStream(); // 写入11
             PipedInputStream in = receiver.getInputStream(); // 读出
             out.connect(in); // 将输出发送到输入
             sender.start(); // 启动线程
             receiver.start();  }
         catch(IOException e)
         {
              System.out.println(e.getMessage());
              }
       }
 static class Sender extends Thread
 {
        private PipedOutputStream out=new PipedOutputStream();
        public PipedOutputStream getOutputStream()
        {
        return out;
        }
        public void run()
        {
        String s=new String("Receiver，你好!");
        try
        {
        out.write(s.getBytes()); // 写入（发送）
        out.close();
        }
        catch(IOException e)
        {
        System.out.println(e.getMessage());
        }
        }
        }
      static   class Receiver extends Thread
 {
        private PipedInputStream in=new PipedInputStream();
        public PipedInputStream getInputStream()
       {
       return in;
       }
       public void run()
       {
       String s=null;
       byte [] buf = new byte[1024];
       try
          {
          int len =in.read(buf); // 读出数据
          s = new String(buf,0,len);
          System.out.println("收到了以下信息："+s);
          in.close();
          }
          catch(IOException e)
          {
          System.out.println(e.getMessage());
          }
          }
    }
}
