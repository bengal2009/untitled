package com.company.SocketDemo;
import java.io.*;
import java.net.*;
/**
 * Created by blin on 2015/1/8.
 */
public class EchoServerThread {
    public static void main(String[] args) throws IOException
    {
         // 声明一个serverSocket
         ServerSocket serverSocket = null;
         // 声明一个监听标识
         boolean listening = true;
         try
         {
             serverSocket = new ServerSocket(1111);
             }
         catch (IOException e)
         {
            System.err.println("Could not listen on port: 1111.");
            System.exit(1);
            }
        // 如果处于监听态则开启一个线程
        while(listening)
             {
             // 实例化一个服务端的socket与请求socket建立连接
             new EchoMulti(serverSocket.accept()).start();
             }
       // 将serverSocket的关闭操作放在循环外，
       // 只有当监听为false是，服务才关闭
       serverSocket.close();
       }
    }
