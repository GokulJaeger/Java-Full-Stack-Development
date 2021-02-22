package com.jsfd.week1.day2.Payment;

public class Payment implements PaymentDetails {
    private String ptype;
    private String paccount;
    private float pamnt;
    private int acc_id;
    private String acc_pwd;
    private int otp;
    private String str;
    private String card_no;
    private int cvv;
    private String user;
    private int day;
    private int month;
    private int otp1;

    public Payment(String ptype, String paccount, float pamnt) {
        this.ptype = ptype;
        this.paccount = paccount;
        this.pamnt = pamnt;
    }

    @Override
    public String getAcctDetails(int acc_id, String acc_pwd, int otp, String paccount) {
        this.acc_id = acc_id;
        this.acc_pwd = acc_pwd;
        this.otp = otp;
        this.paccount=paccount;

        if(this.acc_id!=0 && (this.acc_pwd.length()) > 8) {
            if(this.otp!=0){
                System.out.println(this.ptype+" "+this.pamnt+" is debited from your "+this.paccount+" account "+this.acc_id);
                str="Payment Successfull...";
            }
            else{
                str="Wrong OTP Entered!...";
            }
        }
        else{
            str="Wrong id or password!...";
        }

        return str;
    }

    @Override
    public String getCardDetails(String card_no, int cvv, String user, int day, int month, int otp, String paccount) {
        
        this.card_no=card_no;
        this.cvv=cvv;
        this.user=user;
        this.day=day;
        this.month=month;
        this.otp1=otp;
        this.paccount=paccount;
        
        int length = String.valueOf(this.card_no).length();
        if(length>=12){
            
        }
        
    return str;
    }
    


}
