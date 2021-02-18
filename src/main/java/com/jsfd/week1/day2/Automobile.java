package com.jsfd.week1.day2;
import java.util.Scanner;

class Automobile{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String input1;
        String input2;
        Boolean bool;
        System.out.println("Welcome!");
        System.out.println("Car Driving Simulation");

        car obj[] = new car[5];
        obj[0]= new car("Gokul", "Hyundai Verna", "SXO", 2020, 250, 17, 50);
        obj[1]= new car("Sweatha", "Honda  New City", "ZXD", 2020, 234, 16, 65);
        obj[2]= new car("Sachin", "BMW 5 Series", "530i Sport", 2019, 290, 9, 45);
        obj[3]= new car("Pavithara", "Skoda Rapid", "TSI", 2020, 240, 15, 50);
        obj[4]= new car("Srinath", "Maruthi Suzuki", "Alpha", 2020, 250, 17, 50);


        // for(car bo: obj){
        //     String str=ob.disp();
        //     System.out.println(str);
        // }
        for(car bo: obj){
            System.out.println(bo.getOwner());
        }
        
        System.out.println("Enter owner to check details:");
        input1=sc.nextLine();
        for(car ob: obj){
            if(input1.equalsIgnoreCase(ob.getOwner())){
            String str=ob.disp();
            System.out.println(str);
            }
        }  

        System.out.println("Want to start the car?");
        System.out.println("Enter owner:");
        input2=sc.nextLine();

        for(car ob: obj){
            if(input2.equalsIgnoreCase(ob.getOwner())){
                ob.applyAcceleration(Boolean.TRUE);
                System.out.println("Want to stop the car?(True/False)");
                bool= sc.nextBoolean();
                ob.applyBrake(bool);

            }
        }

        sc.close();  
    }
}
