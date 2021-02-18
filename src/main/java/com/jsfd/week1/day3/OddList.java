package com.jsfd.week1.day3;

import java.util.*;
public class OddList {

    public static void main(String[] args){
        List<Integer> li=new ArrayList<Integer>();  
        li.add(7);  
        li.add(81);  
        li.add(31);  
        li.add(12);
        li.add(19);
        li.add(45);
        li.add(99);
        li.add(33);
        li.add(28);

        // int ii = 67;
        // Integer intObj = ii;//Boxing

        // int jj = intObj;

        int count=0;
        List<Integer> oli=new ArrayList<Integer>();

        for (int i=0;i<li.size();i++){
            int n=li.get(i);
            if(n%2!=0){
                count+=1;
                oli.add(li.get(i));
            } 
        }
        if(count==0){
            System.out.println("The List Do Not contains odd integers!");
            System.out.println(li);
        }
        else{
            System.out.println("The List contains odd integers!");
            System.out.println(oli+"\n");
            System.out.println("The list:");
            System.out.println(li);
        }
    }
    
}

