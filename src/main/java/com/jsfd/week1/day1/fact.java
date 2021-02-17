package com.jsfd.week1.day1;

import java.util.*;
class fact 
{ 
    static long factorial(int x) 
    { 
        if (x == 0) 
          return 1; 
          
        return x*factorial(x-1); 
    } 

    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num: ");
        int a = sc.nextInt(); 
        System.out.println("Factorial of "+ a + " is " + factorial(a));
        sc.close();
    } 
}