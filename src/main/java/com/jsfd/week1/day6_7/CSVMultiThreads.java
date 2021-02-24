package com.jsfd.week1.day6_7;
import java.io. * ;

public class CSVMultiThreads {
  public static final String delimiter = ",";
  
  public static void read(String csvfile) {
    
    try {
      File file = new File(csvfile);
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line = " ";
      String[] tempArr;
      
      while ((line = br.readLine()) != null) {
        tempArr = line.split(delimiter);
        for (String tempStr: tempArr) {
          System.out.print(tempStr + " ");
        }
        System.out.println();
      }
      br.close();
    }
    
    catch(IOException ioe) {
      ioe.printStackTrace();
    }

  }

  public static void main(String[] args) {
    String csvfile = "D:/JFSD/week1/src/main/java/com/jsfd/week1/day6_7/Books.csv";
    CSVMultiThreads.read(csvfile);
  }
}
