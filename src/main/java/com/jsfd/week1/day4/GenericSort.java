package com.jsfd.week1.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericSort {
    public static void main(String[] args) {
            
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Gokul", 102, 50000, 5000));
        personList.add(new Person("Sachin",101, 65000, 5500));
        personList.add(new Person("Sweatha", 104, 75000,4500));
        personList.add(new Person("Pavithara", 103, 58000, 4300));

        System.out.println("Original List:");
        printPersonList(personList);
        
        System.out.println("Sort by name field in alphabetical order:");
        Collections.sort(personList, new GenericComparator("name"));
        printPersonList(personList);
        
        System.out.println("Sort by id field in ascending order:");
        Collections.sort(personList, new GenericComparator(true,"id"));
        printPersonList(personList);
        
        System.out.println("Sort by id field in descending order:");
        Collections.sort(personList, new GenericComparator(false,"id"));
        printPersonList(personList);
        
        System.out.println("Sort by pay's starting salary in ascending order:");
        Collections.sort(personList, new GenericComparator("pay.startSalary"));
        printPersonList(personList);
        
    }

    private static void printPersonList(List<Person> personList) {
        System.out.println("-------------");
        for(Person p: personList){
            System.out.println(p.getName() + "\t" + p.getId() + "\t" + p.getStartSalary() + "\t" +p.getStartBonus());
        }
        System.out.println();
    }

}