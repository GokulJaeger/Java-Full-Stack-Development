package com.jsfd.week1.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistConversion {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Pikalo");
        list.add("Gohan");
        list.add("Trunks");
        list.add("Krillen");
        list.add("Yuncha");
        list.add("Goten");
        list.add("Bolma");
        System.out.println("LikedList: ");
        System.out.println(list+"\n");

        ArrayList<String> array = new ArrayList<String>(list);
        for(Object a:array){
            System.out.println(a);
        } 

        System.out.println("Sorted ArrayList:");
        Collections.sort(array);
        System.out.println(array+"\n");

        System.out.println("Reversed Array List:");
        ListIterator<String> ilist= array.listIterator(array.size());
        while(ilist.hasPrevious()){
            String st = ilist.previous();
            System.out.println(st);
        }
    }
}
