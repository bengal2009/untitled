package com.company.SocketDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by blin on 2015/1/7.
 */
public class HelloServer {
     public static void main(String[] args) throws IOException
     {
         ServerSocket serversocket=null;
         PrintWriter out=null;
         try
         {
             // 在下面实例化了一个服务器端的Socket连接
             serversocket=new ServerSocket(9999);
             }
        catch(IOException e)
        {
           System.err.println("Could not listen on port:9999.");
           System.exit(1);
           }
        Socket clientsocket=null;
        try
        {
             // accept()方法用来监听客户端的连接
             clientsocket=serversocket.accept();
             }
        catch(IOException e)
         {
         System.err.println("Accept failed.");
         System.exit(1);
         }
         out=new PrintWriter(clientsocket.getOutputStream(),true);
         out.println("hello world!");
         clientsocket.close();
         serversocket.close();
         }
  }

