package com.jsfd.week1.day3;

import java.util.Comparator;

class Customers {
    int id; 
    String name, address; 
    
    public Customers(int id, String name, String address){ 
       this.id = id; 
       this.name = name; 
       this.address = address; 
    }  
    public String toString(){ 
       return "[ "+this.id + " "+ this.name + " "+ this.address+" ]"; 
    } 
 } 

 class SortId implements Comparator<Customers>{ 
    public int compare(Customers a, Customers b){ 
       return a.id - b.id; 
    } 
 }
