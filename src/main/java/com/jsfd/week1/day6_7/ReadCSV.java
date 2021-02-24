package com.jsfd.week1.day6_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSV {
  public static void main(String[] args) {
    String line = "";
    String splitBy = ",";
    try {
      //parsing a CSV file into BufferedReader class constructor  
      BufferedReader br = new BufferedReader(new FileReader("D:/JFSD/week1/src/main/java/com/jsfd/week1/day6_7/Books.csv"));
      while ((line = br.readLine()) != null)
      //returns a Boolean value  
      {
        String[] employee = line.split(splitBy);
        //use comma as separator  
        System.out.println("Emp[First Name=" + employee[1] + ", Last Name=" + employee[2] + ", Contact=" + employee[3] + ", City= " + employee[4] + "]");
      }
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}