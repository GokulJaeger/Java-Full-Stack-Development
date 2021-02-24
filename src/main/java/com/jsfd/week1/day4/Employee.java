package com.jsfd.week1.day4;

public class Employee implements Comparable<Employee> {
 
    private int id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;
 
    public Employee(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
 
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
 
    @Override
    public String toString() {
        return "Employee : "+id+" - "+firstName+" - "+lastName+" - "+age;
    }
}
