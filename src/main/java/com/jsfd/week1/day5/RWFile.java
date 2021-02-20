package com.jsfd.week1.day5;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RWFile {
    public static void main(String[] args) {

        // String file1, file2;
        // file1 = "input.txt";
        // file2 = "output.txt";
        try {
            FileReader fr = new FileReader("D:/JFSD/week1/src/main/java/com/jsfd/week1/day5/input.txt");
            // FileReader bfr = new FileReader("D:/JFSD/week1/src/main/java/com/jsfd/week1/day5/output.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/JFSD/week1/src/main/java/com/jsfd/week1/day5/output.txt"));
            int i;
            String str = "";
            while((i=fr.read())!=-1){
                str+=(char)i;
            }
            System.out.println("File Read!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println(str);
            bw.write(str);
            System.out.println("File written in another file!");
            fr.close();
            bw.close();
            FileReader frr = new FileReader("D:/JFSD/week1/src/main/java/com/jsfd/week1/day5/output.txt");
            String str2 = "";
            int j;
            while((j=frr.read())!=-1){
                str2+=(char)j;
            }
            System.out.println("\nThe Outfile is:");
            System.out.println("------------------------------------------------------------------------");
            System.out.println(str2);
            frr.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
