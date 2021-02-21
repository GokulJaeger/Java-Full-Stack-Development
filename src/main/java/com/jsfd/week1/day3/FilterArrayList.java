package com.jsfd.week1.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterArrayList {
    public static void main(String[] args) {
        int ch;
        Scanner sc= new Scanner(System.in);
        Scanner se= new Scanner(System.in);
        String str;
        ArrayList<String> lst= new ArrayList<String>();
        lst.add("Gokul");
        lst.add("Sweatha");
        lst.add("Sachin");
        lst.add("Pavithara");
        lst.add("Magesh");
        lst.add("Vijay");
        lst.add("Ajay");
        System.out.println("--------------------------------------------------------");
        System.out.println("ArrayList: ");
        System.out.println(lst+"\n");

        System.out.println("1.Add  2.Remove? \n Enter Choice:");
        ch = sc.nextInt();
        System.out.println("Enter String:");
        str = se.nextLine();
        sc.close();
        se.close();
        if(ch==1){
            for(int i=0;i<lst.size();){
                String str2=lst.get(i);
                if(str.equalsIgnoreCase(str2)){
                    System.out.println("String already present in the list...");
                }
                else{
                    lst.add(str);
                    System.out.println("String added...");
                    System.out.println(lst);
                }
                break;
            }
        }
        else if(ch==2){
            for(int i=0;i<lst.size();) {
                String str2=lst.get(i);
                if(str.equalsIgnoreCase(str2)){
                    lst.remove(str);
                    System.out.println("String removed...");
                    System.out.println(lst);
                     
                }
                else{
                    System.out.println("String not present in list...");
                }
                break;
            }
        }
        else{
            System.out.println("Invalid Output!...");
        }
    }
}
