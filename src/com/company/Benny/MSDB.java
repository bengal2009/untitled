package com.company.Benny;


/**
 * Created by blin on 2014/12/26.
 */
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.io.*;

public class MSDB {
    // Declare the JDBC objects.

    public static void ConDB(){
        Connection con = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            // Establish the connection.
//            SQLServerDataSource ds = new SQLServerDataSource();
//            ds.setIntegratedSecurity(true);
//            ds.setServerName("192.168.119.1");
//            ds.setPortNumber(1433);
//            ds.setDatabaseName("AdventureWorks");
//            con = ds.getConnection();

            // Execute a stored procedure that returns some data.
//            cstmt = con.prepareCall("{call dbo.uspGetEmployeeManagers(?)}");
//            cstmt.setInt(1, 50);
//            rs = cstmt.executeQuery();

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println("EMPLOYEE: " + rs.getString("CPER") );

                System.out.println();
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (cstmt != null) try { cstmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
    public static void ConDb1(){

        // Create a variable for the connection string.
//        String connectionUrl = "jdbc:sqlserver://192.168.119.111:1433;" +
        String connectionUrl = "jdbc:sqlserver://192.168.119.111:1433;" +
                "databaseName=FOLIO;user=XXX;password=XXX;";

        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        System.out.println("Start Message");
        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            // Create and execute an SQL statement that returns some data.
            String SQL = "SELECT TOP 10 * FROM BLCAL";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("ID"));
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
    }



