package com.jsfd.week1.day2.Diamond;

public interface Swapping {
    default void swap(int x, int y){
        int a=x;
        int b=y;
        System.out.println("Before Sorting");
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Sorting");
        System.out.println("a="+a+" b="+b);
    }
}
