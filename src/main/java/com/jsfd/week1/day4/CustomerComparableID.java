package com.jsfd.week1.day4;

import java.util.Comparator;

public class CustomerComparableID implements Comparator<Customers> {
    @Override
    public int compare(Customers c1, Customers c2) {
        Comparable id1 = (Comparable)(c1.getID());
        Comparable id2 = (Comparable)(c2.getID());
        return id1.compareTo(id2);
    }
}