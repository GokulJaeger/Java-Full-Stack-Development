package com.jsfd.week1.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class CollectionsObjSort
 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Gokul", "Jaeger", 23);
        Employee e2 = new Employee(2, "Sachin", "Hatake", 22);
        Employee e3 = new Employee(3, "Sweatha", "Aunty", 21);
        Employee e4 = new Employee(4, "Pavithara", "Meera", 20);
 
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e2);
        employees.add(e3);
        employees.add(e1);
        employees.add(e4);
 
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }
}
