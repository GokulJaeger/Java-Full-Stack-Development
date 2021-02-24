package com.jsfd.week1.day4;

public class Person {

    private int id;
    private String name;
    private Payment pay;

    public Person(String name, int id,
                   int startSal, int startBon){
        this.name = name;
        this.id = id;
        this.pay = new Payment(startSal, startBon);
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getStartSalary(){
        return pay.startSalary;
    }

    public int getStartBonus(){
       return pay.startBonus;
    }

    private class Payment{
       int startSalary;
       int startBonus;
       public Payment(int sal, int bon){
          this.startSalary = sal;
          this.startBonus = bon;
       }
    }
}
