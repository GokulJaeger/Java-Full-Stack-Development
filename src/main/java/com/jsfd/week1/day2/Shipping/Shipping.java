package com.jsfd.week1.day2.Shipping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;;

public class Shipping {
    private int pid;
    private Date odate;
    private Calendar calender;
    private Date ddate;
    private int qty;
    private String type;
    private float price;
    private String faddr;
    private String taddr;
    private float tax;
    private float tot;
    private Boolean gift;
    private Boolean fdeliv;

    public Shipping(int pid, Date odate, int qty, String type, float price, String faddr, String taddr, Boolean gift,
            Boolean fdeliv) {
        this.pid = pid;
        this.odate = odate;
        this.qty = qty;
        this.type = type;
        this.price = price;
        this.faddr = faddr;
        this.taddr = taddr;
        this.gift = gift;
        this.fdeliv = fdeliv;
    }
    

    
}
