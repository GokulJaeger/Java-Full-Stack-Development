package com.jsfd.week1.day2.Diamond;

public class Diamond implements Factorial, Prime {
    public static void main(String[] args) {
        Diamond D = new Diamond();
        long fac;
        System.out.println("Factorial Operations of 12 is :");
        fac = D.factorial(12);
        System.out.println(fac);
        System.out.println("\nPrime Number or Not?");
        D.prime(123);
        System.out.println("\nSwapping of two Numbers : ");
        D.swap(708, 345);

    }
}
