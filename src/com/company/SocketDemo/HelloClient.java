package com.company.SocketDemo;
import java.io.*;
import java.net.*;
/**
 * Created by blin on 2015/1/7.
 */
public class HelloClient {
    public static void main(String[] args) throws IOException {
        Socket hellosocket = null;
        BufferedReader in1 = null;
        // 下面这段程序，用来将输入输出流与socket关联
        try {
            hellosocket = new Socket("localhost", 9999);
            in1 = new BufferedReader(new InputStreamReader(hellosocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host:localhost!");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection.");
            System.exit(1);
        }
        System.out.println(in1.readLine());
        in1.close();
        hellosocket.close();
    }
}

