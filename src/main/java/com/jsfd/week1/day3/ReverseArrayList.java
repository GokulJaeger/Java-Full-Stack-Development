package com.jsfd.week1.day3;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArrayList {
    public static void main(String[] args) {

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

        System.out.println("ArrayList Reversed using loop:");
        for(int i=lst.size()-1;i>=0;i--){
            System.out.println(lst.get(i));
        }
        System.out.println("--------------------------------------------------------");
        System.out.println(lst+"\n");
        System.out.println("ArrayList Reversed in LIstIterator:");
        ListIterator<String> list= lst.listIterator(lst.size());
        while(list.hasPrevious()){
            String st=list.previous();
            System.out.println(st);
        }

    }
}
