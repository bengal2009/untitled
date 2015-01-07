package com.company.SocketDemo;
import java.io.*;
import java.net.*;
/**
 * Created by blin on 2015/1/7.
 */
public class EchoServer {
    public static void main(String[] args) throws IOException
   {
         ServerSocket serverSocket = null;
         PrintWriter out = null;
         BufferedReader in = null;
         try
         {
            // 实例化监听端口
            serverSocket = new ServerSocket(1111);
            }
         catch (IOException e)
         {
             System.err.println("Could not listen on port: 1111.");
             System.exit(1);
             }
        Socket incoming = null;
        while(true)
             {
             incoming = serverSocket.accept();
             out = new PrintWriter(incoming.getOutputStream(), true);
             // 先将字节流通过InputStreamReader转换为字符流，之后将字符流放入缓冲之中
             in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
             // 提示信息
             out.println("Hello! . . . ");
             out.println("Enter BYE to exit");
             out.flush();
             // 没有异常的情况不断循环
           while(true)
            {
                 // 只有当有用户输入的时候才返回数据
                 String str = in.readLine();
                 // 当用户连接断掉时会返回空值null
                 if(str == null)
                 {
                 // 退出循环
                 break;
                 }
                 else
                 {
                 // 对用户输入字串加前缀Echo：，将此信息打印到客户端
                 out.println("Echo: "+str);
                 out.flush();
                 // 退出命令，equalsIgnoreCase()是不区分大小写的比较
                 if(str.trim().equalsIgnoreCase("BYE"))
                     break;
                 }
                 }     //Second While
             // 收尾工作
             out.close();
             in.close();
             incoming.close();
             serverSocket.close();
             }      //First While
        }
}
