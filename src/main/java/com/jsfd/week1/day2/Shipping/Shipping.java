package com.jsfd.week1.day2.Shipping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.jsfd.week1.day2.Payment.Payment;;

public class Shipping extends Payment{
    protected static int pid;
    protected static Date odate;
    protected static String ddate;
    protected static int qty;
    protected static String type;
    protected static float price;
    protected static String faddr;
    protected static String taddr;
    private float tax;
    private float tot;
    protected static Boolean gift;
    private String ptype;
    protected static Boolean fdeliv;

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public Shipping(int pid, Date odate, int qty, String type, float price, String faddr, String taddr, Boolean gift,
            Boolean fdeliv, String ptype) {
                super(ptype, paccount);
        Shipping.pid = pid;
        Shipping.odate = odate;
        Shipping.qty = qty;
        Shipping.type = type;
        Shipping.price = price;
        Shipping.faddr = faddr;
        Shipping.taddr = taddr;
        Shipping.gift = gift;
        this.ptype = ptype;
        Shipping.fdeliv = fdeliv;
    }


    public void showShipping(){
        Calendar c = Calendar.getInstance();
        c.setTime(Shipping.odate);

        c.add(Calendar.YEAR, 0);
        c.add(Calendar.MONTH, 0);
        c.add(Calendar.DATE, 3); 
        c.add(Calendar.HOUR, 24);
        c.add(Calendar.MINUTE, 0);
        c.add(Calendar.SECOND, 0);

        Date currentDatePlusOne = c.getTime();

        Shipping.ddate = dateFormat.format(currentDatePlusOne);

        System.out.println("\nShipping Details:\n---------------------------------------------------------------------\nVendor_Address = " + Shipping.faddr
                + "\nFast_Delivery = " + Shipping.fdeliv + "\nGift_Wrapping = " + Shipping.gift + "\nOrder_Date = "
                + Shipping.odate
                + "\nDelivery_Date = " + Shipping.ddate + "\nProduct_Id = " + Shipping.pid
        + "\nProduct_Price = " + Shipping.price + "\nPayment_Type = " + this.ptype + "\nQuantity = " + Shipping.qty
                + "\nDelivery_Addres = " + Shipping.taddr + "\nTax_Amount = " + this.tax
        + "\nAmount_to_Pay = " + this.tot + "\nProduct_Type = " + Shipping.type);
    }




    public void doPayment(){
        if(this.ptype.equalsIgnoreCase("Net Banking")){
            Payment PT = new Payment("NetBanking", "SBI");
            PT.getAcctDetails(20212458, "Gokul08765", 9874, "SBI", getPayAmt());
        }
        else if(this.ptype.equalsIgnoreCase("Credit or Master card")){
            Payment PT = new Payment("Credit or Master card", "SBI");
            PT.getCardDetails("542154697812", 254, "Gokul R", 06, 25, 4588, "SBI", getPayAmt());

        }
    }
    
    public float getPayAmt(){
        if(Shipping.fdeliv) {
            if(Shipping.gift) {
                if(Shipping.price > 500.00 && Shipping.price < 5000.00) {
                    this.tax = (float) (Shipping.price * 0.07);
                    if(Shipping.qty != 0) {
                        this.tot = (this.tax+ Shipping.price + 110) * Shipping.qty;
                    }
                }
                else if(Shipping.price > 5000.00) {
                    this.tax = (float) (Shipping.price * 0.09);
                    if(Shipping.qty != 0) {
                        this.tot = this.tax+ Shipping.price + 180;
                    }
                }
            }
            else{
                if(Shipping.price > 500.00 && Shipping.price < 5000.00) {
                    this.tax = (float) (Shipping.price * 0.07);
                    if(Shipping.qty != 0) {
                        this.tot = this.tax+ Shipping.price + 80;
                    }
                }
                else if(Shipping.price > 5000.00) {
                    this.tax = (float) (Shipping.price * 0.09);
                    if(Shipping.qty != 0) {
                        this.tot = this.tax+ Shipping.price + 150;
                    }
                }
            }
        }
        else{
            if(Shipping.price > 500.00 && Shipping.price < 5000.00) {
                this.tax = (float) (Shipping.price * 0.06);
                if(Shipping.qty != 0) {
                    this.tot = this.tax+ Shipping.price + 30;
                }
            }
            else if(Shipping.price > 5000.00) {
                this.tax = (float) (Shipping.price * 0.08);
                if(Shipping.qty != 0) {
                    this.tot = this.tax+ Shipping.price + 30;
                }
            }
        }
        return this.tot;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
    



}
