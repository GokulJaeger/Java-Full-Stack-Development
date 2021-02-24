package com.jsfd.week1.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDBMS {
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd", "root", "Mq.l#5g5r@011");
      System.out.println("Connection is created successfully:");
      stmt = (Statement) conn.createStatement();
      String query1 = "INSERT INTO Employee " + "VALUES ('EMP103', 'John', 'Full Stack Developer', 'US',7845125896,'John@srm.org.in',27)";
      stmt.executeUpdate(query1);
      query1 = "INSERT INTO Employee " + "VALUES ('EMP102', 'Maze', 'Software Developer', 'Germany',8745235476,'Maze@srm.org.in',24)";
      stmt.executeUpdate(query1);
      System.out.println("Record is inserted in the table successfully..................");
      } catch (SQLException excep) {
         excep.printStackTrace();
      } catch (Exception excep) {
         excep.printStackTrace();
      } finally {
         try {
            if (stmt != null)
               conn.close();
         } catch (SQLException se) {}
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }  
      }
      System.out.println("Please check it in the MySQL Table......... ……..");
   }
}
