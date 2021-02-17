package com.jsfd.week1.day1;

import java.util.*;
class findvowl{
   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String str = sc.nextLine();
      str=str.toLowerCase();
      String str1="aeiou";
      int count=0;
      for(int i=0; i<str.length(); i++) {
         for(int j=0; j<5; j++){
            if(str.charAt(i) == str1.charAt(j)) {
               System.out.println("The string contains "+str.charAt(i)+" at the index "+i);
               count+=1;
            }
         }
      }
      System.out.println("Number of vowels in string is= "+count);
      sc.close();
   }
}