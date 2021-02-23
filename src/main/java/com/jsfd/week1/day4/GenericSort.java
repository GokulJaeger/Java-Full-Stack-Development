package com.jsfd.week1.day4;

import java.util.Collections;
import java.util.Iterator;
public class GenericSort {
    public static void main(String[] args) {
        CustomerList<Customers> ltc = new CustomerList<Customers>();
        ltc.insertCustomer(new Customers(2,"trackname1","tracktitle1"));
        ltc.insertCustomer(new Customers(1,"trackname2","tracktitle2"));
        ltc.insertCustomer(new Customers(3,"trackname3","tracktitle3"));

        System.out.println("unsorted:");
        Iterator<Customers> it = ltc.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().getCompleteName());
        }

        System.out.println("sorted:");
        Collections.sort(ltc,new CustomerComparableID());
        Iterator<Customers> it2 = ltc.iterator();
        while(it2.hasNext()) {
            System.out.println(it2.next().getCompleteName());
        }
    }
}