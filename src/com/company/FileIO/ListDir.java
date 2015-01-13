package com.company.FileIO;

import java.io.File;

/**
 * Created by blin on 2015/1/13.
 */
public class ListDir {

    public static void main(String[] args) {
        try {

            File folder = new File("c:\\");
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println(listOfFiles[i].getName()+"\t"+listOfFiles[i].length());
                }
               /* else if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getName());
                }*/
            }
        }
        catch (Exception E) {
            System.out.println(E.toString());
        }
    }

}
