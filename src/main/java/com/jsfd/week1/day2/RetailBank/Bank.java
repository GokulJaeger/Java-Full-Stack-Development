package com.jsfd.week1.day2.RetailBank;

public class Bank implements DDInterface {
    final float exchange = (float) 0.5;
    private float bdamt;
    private int bndd;
    private double bacbal;
    private float totec;
    @Override
    public float generateDD(float damt, int ndd, double acbal) {
        this.bdamt = damt;
        this.bndd = ndd;
        this.bacbal = acbal;
        if(this.bacbal<this.bdamt){
            // System.out.println("Accoutn Balance is Low!...");
            this.totec = 0.0f;
        }
        else{
            this.totec = (this.bdamt*exchange)*this.bndd;
        }
        return this.totec;
    }
    
}
