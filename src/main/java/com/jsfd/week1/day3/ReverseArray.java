package com.jsfd.week1.day3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array size:");
        n= sc.nextInt();
        int array[]= new int[n];

        System.out.println("Input data: ");
        for(int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        reverse(array);
        sc.close();
    }

    public static void reverse(int[] arr){

        System.out.println("Reverse Array:");

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
