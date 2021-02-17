package com.jsfd.week1.day1;

import java.util.*;
class swap
{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A and B:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Sorting");
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Sorting");
        System.out.println("a="+a+" b="+b);
        sc.close();
    }
}