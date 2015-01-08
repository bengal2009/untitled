package com.company.SocketDemo;
import java.net.*;
import java.io.*;
/**
 * Created by blin on 2015/1/8.
 */
public class UdpSend {
   public static void main(String[] args)
   {
        // 要编写UDP网络程序，首先要用到java.net.DatagramSocket类
        DatagramSocket ds = null;
        DatagramPacket dp = null;
        try {
            ds = new DatagramSocket(3000);
            }
       catch (SocketException ex) {
             }
         String str = "hello world ";
         try {
            dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress
                    .getByName("localhost"), 9000);
             //调用InetAddress.getByName()方法可以返回一个InetAddress类的实例对象
             } catch (UnknownHostException ex1) {
             }
        try {
            ds.send(dp);
            } catch (IOException ex2) {
            }
         ds.close();
         }
    }
