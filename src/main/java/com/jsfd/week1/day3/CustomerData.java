package com.jsfd.week1.day3;

import java.util.Comparator;

public class CustomerData {
    private String fname;
    private String lname;
    private String email;
    private int age; 
  
    public CustomerData(String fname, String lname, String email, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
    }
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override 
    public String toString() 
    { 
        return "[ First Name=" + this.fname + ",\tLate Name="
            + this.lname +",\tEmail=" + this.email + ",\tAge=" + this.age + " ]"; 
    }

    public static Comparator<CustomerData> fnameComparator = new Comparator<CustomerData>() { 
        
        public int compare(CustomerData cd1, CustomerData cd2){ 
  
                  String Customer1 = cd1.getFname().toUpperCase(); 
                  String Customer2 = cd2.getFname().toUpperCase(); 

                  return Customer2.compareTo(Customer1); 
              } 
          };

    public static Comparator<CustomerData> CustomerAge = new Comparator<CustomerData>() { 
        public int compare(CustomerData cd1, CustomerData cd2){ 
  
                  int age1 = cd1.getAge(); 
                  int age2 = cd2.getAge(); 
   
                  return age2-age1; 
              } 
          };    
}
