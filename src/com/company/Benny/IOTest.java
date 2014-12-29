package com.company.Benny;
import java.io.*;

/**
 * Created by blin on 2014/12/22.
 */
public class IOTest {
    public static void filewrite(){
        try {
            String filename = "student.txt";
            FileWriter fWrite = new FileWriter(filename,true); //Append Mode
             BufferedWriter fOut = new BufferedWriter(fWrite);
            fOut.write("王一, 85, 90");   // 寫入一筆資料
            fOut.newLine();               // 換行字元
            fOut.write("張三, 65, 67");
            fOut.newLine();
            fOut.flush();                 // 清理緩衝區
            fWrite.close();               // 關閉檔案
        }
        catch (IOException e) {
            System.out.println("檔案處理有誤!!");
        }
    }
    public static void fileread(){
        String data;
        try {
//            FileReader fRead = new FileReader("..\\J14_3_1\\student.txt");
            FileReader fRead = new FileReader("student.txt");
            BufferedReader fIn = new BufferedReader(fRead);
            do {
                data = fIn.readLine();    // 讀取一行字串資料
                if(data == null) break;     // 若資料讀取完畢，跳離迴圈
                System.out.println(data);   // 顯示所讀取的資料
            } while (true);
            fRead.close();               // 關閉檔案
        }
        catch (IOException e) {
            System.out.println("檔案處理有誤!!");
        }
    }
public static void filecopy()
{
    String fname = "mountain.jpg";   // 多媒體檔案名稱
    try {
        // 取得輸入串流
        FileInputStream fIn = new FileInputStream (fname);
        byte data[] = new byte[fIn.available()]; // 取得檔案的大小
        fIn.read(data);              // 輸入串流存放陣列
        fIn.close();                 // 關閉輸入串流

        // 取得輸出串流
        FileOutputStream fOut = new FileOutputStream ("複製-" + fname);
        fOut.write(data);            // 輸出串流取得陣列資料
        System.out.println("檔案已複製....");
        fOut.close();                // 關閉輸出串流
    }
    catch (IOException e) {
        System.out.println("檔案處理有誤!!");
    }
}

}




