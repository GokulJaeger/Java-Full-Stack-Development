package com.jsfd.week1.day2.Order;

import java.util.Date;

import com.jsfd.week1.day2.Payment.Payment;
import com.jsfd.week1.day2.ProductDetails.ProductDetails;
import com.jsfd.week1.day2.Shipping.Shipping;

public class Order {
    static ProductDetails PD;
    static Shipping SH;
    static Payment PT;

    public static void putorder() {
        Date currentdate = new Date();
        PD = new ProductDetails(209364, "Gokul", 1, 9384757730l, "Sony Earphones", "Electronics", currentdate);
        
    }
    public static void readyorder(){
        Date currentdate = new Date();
        SH = new Shipping(209364, currentdate, 1, "Electronics", 2499.00f, "Benguluru", "Vellore", true, true,
                "Net Banking");
    }
    public static void pay(){
        SH.doPayment();
    }
     public static void getdata(){
        PD.showProduct();
    }
    public static void ShippingDetails(){
        SH.showShipping();
    }
}
