package com.jsfd.week1.day2.ProductDetails;

import java.util.Date;

public class ProductDetails {
    private int pid;
    private String name;
    private int qty;
    private long pnum;
    private String prod;
    private String type;
    private Date odate;

    public ProductDetails(int pid, String name, int qty, long pnum, String prod, String type, Date odate) {
        this.pid = pid;
        this.name = name;
        this.qty = qty;
        this.pnum = pnum;
        this.prod = prod;
        this.type = type;
        this.odate = odate;
    }
}
