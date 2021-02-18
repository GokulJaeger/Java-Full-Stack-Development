package com.jsfd.week1.day2;
// import java.util.Scanner;

import java.util.Scanner;

class Automobile{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        // int n;
        Boolean bool;

        System.out.println("Welcome!");
        System.out.println("Car Driving Simulation");
        // System.out.println("Enter the number of vehicles");
        // n = sc.nextInt();
        
        car obj= new car("Gokul", "Hyundai Verna", "OX0", 2020, 250, 17, 50);
        // System.out.println(obj.getOwner()+" has "+obj.getName()+" "+obj.getModel()+" model which is made in "+obj.getYear()+", which has a top speed of "+obj.getSpeed()+"Kmph. It gives a milleage of "+obj.getMil()+"kmpl. The car holds  "+obj.getTank()+"l of tank capacity");
        String str=obj.disp();
        System.out.println(str);
        System.out.println("Want to start the car?(True/False)");
        bool=sc.nextBoolean();
        obj.applyAcceleration(bool);

        System.out.println("Want to stop the car?(True/False)");
        bool=sc.nextBoolean();
        obj.applyBrake(bool);
        sc.close();  
    }
}
