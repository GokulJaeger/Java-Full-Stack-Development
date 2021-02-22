package com.jsfd.week1.day4;

import java.util.Scanner;

public class Idcard {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        number = sc.nextLine();
        int length = String.valueOf(number).length();
        System.out.println(length);
    }
}
