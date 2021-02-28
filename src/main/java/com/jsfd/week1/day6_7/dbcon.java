package com.jsfd.week1.day6_7;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class dbcon {
    public static final String url=connection.url;
    public static final String user=connection.user;
    public static final String password=connection.password;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Database Connection");
        System.out.println("1.Create\t2.Insert");
        int ch=sc.nextInt();
        if(ch==1){
            create();
        }
        else if(ch==2){
            insert();
        }
        else{
            System.out.println("Invalid Option!.");
        }
        sc.close();

    }

    public static void insert() {
        try {
            Connection mycon = DriverManager.getConnection(url, user, password);
            Statement statement = mycon.createStatement();
            String query = "INSERT INTO Employee VALUES ('EMP103', 'John', 'FS Development', 'US',7856,'John@srm.org.in',27)";
            int rSetet = statement.executeUpdate(query);
            if (rSetet == 1) {
                System.out.println("Query Exeuted");
            } else {
                System.out.println("Error!...");
            }
            statement.close();
            mycon.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void create() {
        try {
            Connection mycon = DriverManager.getConnection(url, user, password);
            Statement statement = mycon.createStatement();
            String query = "create table employee(Eid varchar(10)PRIMARY KEY, Ename varchar(20)NOT NULL, Edesig varchar(15)NOT NULL, Eaddr varchar(50)NOT NULL, Ephone int(10), Email varchar(15), Eage int(3))";
            int rSetet = statement.executeUpdate(query);
            if(rSetet==0){
                System.out.println("Query Exeuted");
            }
            else{
                System.out.println("Error!...");
            }
            statement.close();
            mycon.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}