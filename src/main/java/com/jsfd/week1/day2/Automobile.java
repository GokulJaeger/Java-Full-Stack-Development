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
        System.out.println("----------------------------------------------");
        car obj[] = new car[5];
        obj[0]= new car("Gokul", "Hyundai Verna", "SXO", 2020, 250, 17, 50);
        obj[0].getEngine(1497, 115, 144);
        obj[0].getIFeatures(6, true, 6, 580, true);
        obj[0].getEFeatures(true, true, false);
        obj[1]= new car("Sweatha", "Honda  New City", "ZXD", 2020, 234, 16, 65);
        obj[1].getEngine(1498, 121, 145);
        obj[1].getIFeatures(6, true, 6, 630, true);
        obj[1].getEFeatures(true, true, false);
        obj[2]= new car("Sachin", "BMW 5 Series", "530i Sport", 2019, 290, 9, 45);
        obj[2].getEngine(1998, 248, 175);
        obj[2].getIFeatures(8, true, 8, 470, true);
        obj[2].getEFeatures(true, false, true);
        obj[3]= new car("Pavithara", "Skoda Rapid", "TSI", 2020, 240, 15, 50);
        obj[3].getEngine(999, 110, 175);
        obj[3].getIFeatures(6, false, 6, 590, true);
        obj[3].getEFeatures(true, false, false);
        obj[4]= new car("Srinath", "Maruthi Suzuki Ciaz", "Alpha", 2020, 250, 17, 50);
        obj[4].getEngine(1462, 105, 138);
        obj[4].getIFeatures(4, false, 6, 640, true);
        obj[4].getEFeatures(true, false, false);

        // for(car bo: obj){
        //     String str=ob.disp();
        //     System.out.println(str);
        // } 
        for(;;){
            System.out.println("\nStart or Exit!");
            String in = sc.nextLine();
            if(in.equalsIgnoreCase("start")){
                for(car bo: obj){
                    System.out.println(bo.getOwner());
                }
                System.out.println("\nEnter owner to check details:");
                input1=sc.nextLine();
                for(car ob: obj){
                    if(input1.equalsIgnoreCase(ob.getOwner())){
                    String str=ob.disp();
                    System.out.println(str);
                    ob.spec();
                    }
                }  

                System.out.println("\nWant to start the car?");
                System.out.println("\nEnter owner:");
                input2=sc.nextLine();

                for(car ob: obj){
                    if(input2.equalsIgnoreCase(ob.getOwner())){
                        ob.applyAcceleration(Boolean.TRUE);
                        System.out.println("\nWant to stop the car?(True/False)");
                        bool= sc.nextBoolean();
                        ob.applyBrake(bool);

                    }
                    // else{
                    //     System.out.println("Invalid User!\nTry again");
                    //     continue;
                    // }
                }
                sc.close();
                Scanner cn = new Scanner(System.in);
                System.out.println("\nWant Continue?:");
                String con = cn.nextLine();
                if(con.equalsIgnoreCase("yes")){
                }
                else{
                    break;
                }
            }
            else if(in.equalsIgnoreCase("exit"))
            {
                break;
            }
        }
    }
}
