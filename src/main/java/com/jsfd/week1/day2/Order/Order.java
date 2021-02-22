package com.jsfd.week1.day2.Order;

import java.util.Date;

import com.jsfd.week1.day2.ProductDetails.ProductDetails;
import com.jsfd.week1.day2.Shipping.Shipping;

public class Order {
    public static void putdata(){
        Date currentdate = new Date();
        ProductDetails PD = new ProductDetails(209364, "Gokul", 1, 9384757730l, "Sony Earphones", "Electronics", currentdate);
        Shipping SH = new Shipping(209364, currentdate, 1, "Electronics", 2499.00f, "Benguluru", "Vellore", true, true);
    }
}
