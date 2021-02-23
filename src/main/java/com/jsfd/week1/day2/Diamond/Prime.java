package com.jsfd.week1.day2.Diamond;

public interface Prime extends Swapping {
    default void prime(int a){
        int count=0;
        int n=a;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count>2){
            System.out.println(n + " is Not Prime Number");
        }
        else{
            System.out.println(n + " is Prime Number");
        }
    }
}
