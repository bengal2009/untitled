package com.company.SocketDemo;

/**
 * Created by blin on 2015/1/9.
 */
public class TestMail {
    public static void main(String[] args){
        String smtp = "192.168.91.3";
        String from = "blin@csavagencies-china.com";
        //String to = "lizhuoran@staff.cntv.cn,robinpipi@126.com";
        String to="blin@csavagencies-china.com";
        //String copyto = "lidudu2009@sina.com,robinzhang521@sina.com";
        String copyto =null;
        String subject = "邮件主题2";
        String content = "邮件内容";
        String username="";
        String password="";
        String filename = "E:\\我的文档\\download\\downloads_location.txt";
        SendMail.send(smtp, from, to,subject,content, username, password);
        //SendMail.sendAndCc(smtp, from, to, copyto,subject, content, username, password, filename);
        // String[] filenames = {"E:\\我的文档\\download\\downloads_location.txt","E:\\我的文档\\download\\file.java"};
        //MySendMail.sendAndCcFiles(smtp, from, to, copyto,subject, content, username, password, filenames);
    }

}
