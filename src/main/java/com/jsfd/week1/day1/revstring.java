package com.jsfd.week1.day1;

import java.util.*;

class revstring {
    public static void main(String[] args)
    {
        System.out.println("Plese enter the name and press enter....");
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		
		//StringReverse sRev = new StringReverse();
		//String result = sRev.reverseString(name);
							
		System.out.println("The O/p is....");
		char ch[]=name.toCharArray();
		String revstr="";
		for(int i=ch.length-1;i>=0;i--) {
			revstr+=ch[i];
		}
		System.out.println(revstr);
		sc.close();
    }
}