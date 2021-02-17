package com.jsfd.week1.day1;

import java.util.*;
class rmwhitesp {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String str = sc.nextLine();
      str = str.replaceAll(" ", "");
      System.out.println(str);
      sc.close();
   }
}