package com.company.SocketDemo;
import java.io.*;
import java.net.*;
/**
 * Created by blin on 2015/1/8.
 */
public class EchoClient {
    public static void main(String[] args) throws IOException
   {
       Socket echoSocket = null;
       PrintWriter out = null;
       BufferedReader in = null;
       try
       {
            echoSocket = new Socket ( "localhost", 1111);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            }
         catch (UnknownHostException e)
         {
             System.err.println("Don't know about host: localhost.");
             System.exit(1);
             }
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        // 将客户端Socket输入流（既服务器端Socket的输出流）输出到标准输出上
        while ((userInput = stdIn.readLine()) != null)
            {
            out.println(userInput);
            System.out.println(in.readLine());
            }
         out.close();
         in.close();
         echoSocket.close();
         }
    }
