package com.jsfd.week1.day3;
import java.util.ArrayList;
import java.util.Collections;

class Customer {
  
    public static void main(String args[]) 
    {
        ArrayList<CustomerData> arraylist = new ArrayList<CustomerData>(); 
        
        arraylist.add(new CustomerData("Deku", "Midoria", "deku@gmail.com", 21)); 
        arraylist.add(new CustomerData("Murderer", "Kachan", "Muderer@gmail.com", 22)); 
        arraylist.add(new CustomerData("Hot & Cold", "Shoto", "Shoto@gmail.com", 23)); 

        System.out.println("\nCustomer Data!");
        System.out.println("---------------------------------------------------------------------------------------------\n");
        for(CustomerData str : arraylist) { 
            System.out.println(str); 
        }

        System.out.println("\nCustomer First-Name Descending Order:"); 
        System.out.println("---------------------------------------------------------------------------------------------\n");
        Collections.sort(arraylist,CustomerData.fnameComparator); 
  
        for(CustomerData str : arraylist) { 
            System.out.println(str); 
        } 
   
        System.out.println("\nCustomer Age Descending Order:"); 
        System.out.println("---------------------------------------------------------------------------------------------\n");
        Collections.sort(arraylist, CustomerData.CustomerAge); 
        
        for(CustomerData str : arraylist) { 
            System.out.println(str); 
        } 
    } 
}
