package com.jsfd.week1.day2;

import java.util.Scanner;

import com.jsfd.week1.day2.Order.Order;

public class ShippingSummary {
    public static void main(String[] args) {
        String n,m,o,p;
        Scanner scan = new Scanner(System.in);
        System.out.println("<---Product Shipping--->");
        for(;;){
            System.out.println("\nWant to put your order?(Yes/No):");
            n = scan.nextLine();
            if(n.equalsIgnoreCase("Yes")){
                Order.putorder();
            }
            else{
                break;
            }
            System.out.println("\nWant to ready your Shipping?(Yes/No):");
            m = scan.nextLine();
            if(m.equalsIgnoreCase("Yes")){
                Order.readyorder();
            }
            else{
                break;
            }
            System.out.println("\nWant to view your Product?(Yes/No):");
            o = scan.nextLine();
            if(o.equalsIgnoreCase("Yes")){
                Order.getdata();
            }
            else{
                break;
            }
            System.out.println("\nReady to Pay?(Yes/No):");
            p = scan.nextLine();
            if(p.equalsIgnoreCase("Yes")){
                Order.pay();
                System.out.println("\nYour Order Details");
                System.out.println("---------------------------------------------------------------------");
                Order.ShippingDetails();
                break;
            }
            else{
                break;
            }
        }

        
    }
}
