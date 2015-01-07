package com.company.FileIO;
import java.io.* ;
/**
 * Created by blin on 2015/1/7.
 */
public class ByteArray {
    public static void main(String[] args) throws Exception
    {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] src = tmp.getBytes(); // src为转换前的内存块
        ByteArrayInputStream input = new ByteArrayInputStream(src);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        new ByteArray().transform(input, output);
        byte[] result = output.toByteArray(); // result为转换后的内存块
        System.out.println(new String(result));
        }
     public void transform(InputStream in, OutputStream out)
     {
        int c = 0;
        try
        {
             while ((c = in.read()) != -1) // read在读到流的结尾处返回-1
                {
                int C = (int) Character.toUpperCase((char) c);
                out.write(C);
                    }
             }
         catch (Exception e)
         {
         e.printStackTrace();
         }
         }
    }
