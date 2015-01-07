package com.company.Benny;

/**
 * Created by blin on 2015/1/7.
 */
public class RuntimeDemo {

    public static void main(String[] args)
     {
        Runtime run = Runtime.getRuntime() ;
        try
        {
         run.exec( "notepad.exe") ;
         }
        catch (Exception e)
        {
          e.printStackTrace();
          }
        }
}
