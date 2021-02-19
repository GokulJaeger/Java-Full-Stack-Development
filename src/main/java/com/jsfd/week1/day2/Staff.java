package com.jsfd.week1.day2;

public class Staff {
    public static void main(String[] args) {
        // int n;
        // int x;
        // Scanner sa= new Scanner(System.in);
        // System.out.println("Enter the number of Students:");
        // n = sa.nextInt();
        // Student st[] = new Student[n];
        // for(int i=0;i<n;i++){
        //     st[i].getdata();
        //     st[i].getmarks();
        // }
        // Scanner sb= new Scanner(System.in);
        // System.out.println("Enter the student id to get the details:");
        // x = sb.nextInt();
        // for(int i=0; i<n; i++){
        //     int a= st[i].getId();
        //     if(a==x){
        //         st[i].putdata();
        //         st[i].putmarks();
        //     }
        //     else{
        //         System.out.println("INvalid Student Id!");
        //     }
        // }
        // sa.close();
        // sb.close();

        Student st = new Student();
        st.getdata();
        st.getmarks();
        String str;
        str = st.putdata();
        System.out.println(str);
        // st.putmarks();
    }
}

