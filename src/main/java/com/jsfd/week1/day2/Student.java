package com.jsfd.week1.day2;

import java.util.Scanner;

interface PutDetails {
    String putdata();
    void putmarks();
}

interface GetDetails{
    void getdata();
    void getmarks(int a[], int b[]);
}

public class Student implements PutDetails, GetDetails{

    private String id;
    private String name;
    private String dept;
    private String year;
    private int no;
    private int mark[];
    private int credit[];
    private float avg = 0.0f;
    private float total = 0.0f;
    private float gt = 0.0f;
    private float ct = 0.0f;
    private float gpa = 0.0f;

    //@Override
    public void getdata() {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Student Id:");
        this.id = se.nextLine(); 
        System.out.println("Enter Student Name:");
        this.name = se.nextLine();
        System.out.println("Enter Student Department:");
        this.dept = se.nextLine();
        System.out.println("Enter Student Year:");
        this.year = se.nextLine();
        se.close();
    }

    //@Override
    public void getmarks(int mar[], int crd[]) {
        this.mark = mar;
        this.credit = crd;

    }

    //@Override
    public String putdata() {

        return "[ Name: "+this.name+"\tID: "+this.id+"\tDepartment: "+this.dept+"\tYear: "+this.year+" ]";
        

    }

    //@Override
    public void putmarks() {
        
        for(int i=0; i<this.mark.length; i++){
            this.avg+=this.mark[i];
        }
        for(int i=0; i<this.mark.length; i++){
            this.total+=this.mark[i];
        }
        for(int i=0; i<this.credit.length; i++){
            this.ct+=this.credit[i];
        }
        for(int i=0; i<this.mark.length; i++){
            this.gt+=(this.mark[i]*this.credit[i]);
        }
        this.gpa=(this.gt/this.ct);

        System.out.println("[ Total Marks: "+this.total+"/"+(this.no*100)+"\tAverage: "+this.avg+"\tGPA: "+this.gpa+" ]");

    }

    // public String getId() {
    //     return this.id;
    // }

    // public String getName() {
    //     return this.name;
    // }
    

}
