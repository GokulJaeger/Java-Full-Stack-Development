package com.jsfd.week1.day3;
import java.util.*;
import java.util.concurrent.*;
   
public class TreMap { 
 
   public static void main(String[] args){ 
      System.out.println("TreeMap of Customerss!");

      TreeMap<Customers, Integer> tm = new TreeMap<Customers, Integer>(new SortId()); 
   
      tm.put(new Customers(175987, "Linda", "US"), 6);
      tm.put(new Customers(402487, "Lucifer", "US"), 1);
      tm.put(new Customers(121547, "Mazikeen", "South Africa"), 3); 
      tm.put(new Customers(702887, "Trixie", "California"), 8);
      tm.put(new Customers(547821, "Chloe", "California"), 2); 
      tm.put(new Customers(482487, "Amanadiel", "New York"), 4);
      tm.put(new Customers(109087, "Dan", "Texa"),5);
      tm.put(new Customers(862487, "Ella", "US"), 7);
      System.out.println("TreeMap: \n"+ tm);

      // System.out.println("Ordered TreeMap");
   } 
}