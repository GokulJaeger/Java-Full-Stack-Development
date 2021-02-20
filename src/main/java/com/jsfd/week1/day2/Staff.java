package com.jsfd.week1.day2;

import java.util.Scanner;

import org.springframework.util.SystemPropertyUtils;

public class Staff {
    public static void main(String[] args) {
        int n;
        Scanner sa= new Scanner(System.in);
        System.out.println("Enter the number of Students:");
        n = sa.nextInt();
        sa.close();
        Student st[] = new Student[n];
        int i=0;
        while(i<n){
            st[i].getdata();
            for(int k=0;k<n;k++){
                int x;
                int mar[];
                int crd[];
                Scanner sb = new Scanner(System.in);
                System.out.println("Enter the total no. of subjects:");
                x = sb.nextInt();
                mar = new int[x];
                System.out.println("Enter the marks: ");
                for(int j=0; j<x; j++){
                    mar[j] = sb.nextInt();
                }
                sb.close();
                Scanner sc = new Scanner(System.in);
                crd = new int[x];
                for(int j=0; j<x; j++){
                    crd[j] = sc.nextInt();
                }
                st[i].getmarks(mar,crd);
                sc.close();
            }
            i++;
        }
        System.out.println("Enter the student id to get the details:");
        for(int k=0; k<n; k++){
            String str;
            str = st[k].putdata();
            System.out.println(str);
            st[k].putmarks();
        }
    }
}

