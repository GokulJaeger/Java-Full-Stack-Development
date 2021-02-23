package com.jsfd.week1.day4;

public class Customers {
    private Integer id;
    private String fname;
    private String lname;
    Customers(int id,String fname,String lname) {
        this.id=id;
        this.fname=fname;
        this.lname=lname;
    }
    public String getfname() {
        return this.fname;
    }
    public String getlname() {
        return this.lname;
    }
    public int getID() {
        return this.id;
    }
    public String getCompleteName() {
        return this.id+"\t"+this.fname.toString()+" - "+this.lname.toString();
    }
}