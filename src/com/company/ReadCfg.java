package com.company;

import java.io.*;
import java.util.Date;
import java.util.Properties;

/**
 * Created by blin on 2015/1/6.
 */
public class ReadCfg {
    static class GetPropertyValues {

        public String getPropValues() throws IOException {

            String result = "";
            Properties prop = new Properties();
            String propFileName = "Test.cfg";

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            inputStream.close();
            Date time = new Date(System.currentTimeMillis());

            // get the property value and print it out
            String user = prop.getProperty("user");
            String company1 = prop.getProperty("company1");
            String company2 = prop.getProperty("company2");
            String company3 = prop.getProperty("company3");
            result = "Company List = " + company1 + ", " + company2 + ", " + company3;
            System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);

            return result;
        }
    }

    static class SetProp{
        public void setPropValues() throws IOException {
            Properties prop = new Properties();
            OutputStream output = null;

            try {

                output = new FileOutputStream("Test.cfg",true);

                // set the properties value
                prop.setProperty("database", "localhost");
                prop.setProperty("dbuser", "mkyong");
                prop.setProperty("dbpassword", "password");

                // save properties to project root folder
                prop.store(output, null);

            } catch (IOException io) {
                io.printStackTrace();
            } finally {
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        }

    public static void main(String[] args) throws IOException{
        GetPropertyValues t1=new  GetPropertyValues();
        SetProp t2=new SetProp();
        t1.getPropValues();
//        t2.setPropValues();
    }
}
