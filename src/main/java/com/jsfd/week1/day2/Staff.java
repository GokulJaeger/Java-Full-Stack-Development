package com.jsfd.week1.day2;

import java.util.Scanner;

public class Staff {
    public static void main(String[] args) {
        //int n;
        Scanner sa= new Scanner(System.in);
        // System.out.println("Enter the number of Students:");
        // n = sa.nextInt();
        // sa.close();
        // Student st[] = new Student[n];
        // int i=0;
        // for(i=0; i<n; i++){
        //     //st[i].getdata();
        //     for(int k=0;k<n;k++){
        //         int x;
        //         int mar[];
        //         int crd[];
        //         Scanner sb = new Scanner(System.in);
        //         System.out.println("Enter the total no. of subjects:");
        //         x = sb.nextInt();
        //         mar = new int[x];
        //         System.out.println("Enter the marks: ");
        //         for(int j=0; j<x; j++){
        //             String  q = sb.nextLine();
        //             mar[j]= Integer.parseInt(q);
        //         }
        //         sb.close();
        //         Scanner sc = new Scanner(System.in);
        //         crd = new int[x];
        //         for(int j=0; j<x; j++){
        //             String  r = sb.nextLine();
        //             crd[j] = Integer.parseInt(r);
        //         }
        //         st[i].getmarks(mar,crd);
        //         sc.close();
        //     }
        // }
        // System.out.println("Enter the student id to get the details:");
        // for(int k=0; k<n; k++){
        //     String str;
        //     str = st[k].putdata();
        //     System.out.println(str);
        //     st[k].putmarks();
        // }
        Student st[] = new Student[3];
        st[0].getdata("102","Gokul","MCA","2019");
        st[1].getdata("101","Rikhitha","MCA","2019");
        st[2].getdata("103","Srinath","MCA","2019");

        int mar[] = new int[3];
        int crd[] = new int[3];
        for(int i=0; i<3;i++){
            System.out.println("Enter marks for "+i+ " students:");
            for(int j=0; j<5; j++){
                mar[j]= sa.nextInt(); 
            }
            System.out.println("Enter marks for"+i+" students:");
            for(int j=0; j<5; j++){
                crd[j]= sa.nextInt(); 
            }
            st[i].getmarks(mar, crd);
        }
;    }
}

