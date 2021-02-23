package com.jsfd.week1.day2.RetailBank;

import java.util.Date;

public class BankEmployee{
    private String name;
    private String payto;
    private String payable;
    private String addr;
    private float damt;
    private int ndd;
    private String amtword;
    private Date date = new Date();
    private float totpay;

    // public BankEmployee(String name, String payto, String payable, String addr, float damt, int ndd, String amtword, float totpay) {
    //     this.name = name;
    //     this.payto = payto;
    //     this.payable = payable;
    //     this.addr = addr;
    //     this.damt = damt;
    //     this.ndd = ndd;
    //     this.amtword = amtword;
    //     this.totpay = totpay;
    // }
    
    public BankEmployee(String name, String payto, String payable, String addr, float damt, int ndd,
			String amtword, float gettot) {
                this.name = name;
                this.payto = payto;
                this.payable = payable;
                this.addr = addr;
                this.damt = damt;
                this.ndd = ndd;
                this.amtword = amtword;
                this.totpay = gettot;
	}

	public void getDD(){
        if((this.totpay-this.damt)>0.00){
            if(this.ndd==1){
                System.out.println("Demand Draft:\n------------------------------------------------------------------");
                System.out.println("issued by STATE BANK OF INDIA");
                System.out.println("Date : "+this.date+"\nName : "+this.name+" Nominee : "+this.payto+"Payable at : "+this.payable+"\nAmount : "+this.damt+"/- Amount in words "+this.amtword);
                System.out.println("Address : "+this.addr+" DD Number : "+Math.abs(hashCode())+" 10098 2001");
            }
            else{
                for(int i=0; i<this.ndd; i++){
                    System.out.println("Demand Draft:\n------------------------------------------------------------------");
                    System.out.println("issued by STATE BANK OF INDIA");
                    System.out.println("Date : "+this.date+"\nName : "+this.name+"\tNominee : "+this.payto+"Payable at : "+this.payable+"\nAmount : "+this.damt+"/- Amount in words "+this.amtword);
                    System.out.println("Address : "+this.addr+"\nDD Number : "+Math.abs(hashCode())+i+" 100 98 2001");    
                }
            }

        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((payable == null) ? 0 : payable.hashCode());
        result = prime * result + ((payto == null) ? 0 : payto.hashCode());
        result = prime * result + ((addr == null) ? 0 : addr.hashCode());
        result = prime * result + ((amtword == null) ? 0 : amtword.hashCode());
        result = prime * result + Float.floatToIntBits(damt);
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ndd;
        result = prime * result + Float.floatToIntBits(totpay);
        return result;
    }

    
}
