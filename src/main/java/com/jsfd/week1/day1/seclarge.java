package com.jsfd.week1.day1;

class seclarge {
    public static void main(String[] args){
        int[] arr = new int[] {78, 34, 17, 3, 90, 34, 11, 34, 6, 55, 200, 55};  
        System.out.println("Array elements:");  
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++)
            {
                int temp = 0;
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }  
            System.out.println(arr[i]);  
        }
        System.out.println("Largest Number is: "+arr[arr.length-1]);
        System.out.println("Second largest Number is: "+arr[arr.length-2]);
    }
}