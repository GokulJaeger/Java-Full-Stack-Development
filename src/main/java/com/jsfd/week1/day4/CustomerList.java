package com.jsfd.week1.day4;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerList<T> extends ArrayList<T>{
    private static final long serialVersionUID = 1L;
    ArrayList<T> arraylist;

    CustomerList() {
        arraylist = new ArrayList<T>();
    }

    public boolean insertCustomer(T Customers) {
        if(arraylist.add(Customers)) 
            return true;
        return false;
    }
    public void listAllCustomers(java.util.Iterator<T> iterat) {
        while(iterat.hasNext()) {
            System.out.println(iterat.next());
        }
    }

    public Iterator<T> iterator() {
        return arraylist.iterator();
    }
}
