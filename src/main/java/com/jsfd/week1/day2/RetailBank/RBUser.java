package com.jsfd.week1.day2.RetailBank;


public class RBUser {
    public static void main(String[] args) {
        float gettot;
        float damt;
        damt = 12000.0f;
        Bank b1 = new Bank();
        gettot = b1.generateDD(damt, 1, 75420.0f);
        BankEmployee be1 = new BankEmployee("Gokul R", "SRM Technologies", "Chennai", "Vellore-632002",damt, 1, "TWELVE THOUSAND ONLY", gettot);
        be1.getDD();
    }
}
