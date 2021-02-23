package com.jsfd.week1.day2.Payment;


public class Payment implements PaymentDetails {
    private String ptype;
    protected static String paccount;
    private float pamnt;
    private static int acc_id;
    private String acc_pwd;
    private int otp;
    private String card_no;
    private int cvv;
    private String user;
    private int year;
    private int month;
    private int otp1;

    public Payment(String ptype, String paccount) {
        this.ptype = ptype;
        Payment.paccount = paccount;
    }

    public void getAcctDetails(int acc_id, String acc_pwd, int otp, String paccount, float pamnt) {
        Payment.acc_id = acc_id;
        this.acc_pwd = acc_pwd;
        this.otp = otp;
        Payment.paccount = paccount;
        this.pamnt = pamnt;

        if(Payment.acc_id != 0 && (this.acc_pwd.length()) > 8) {
            if(this.otp!=0){
                System.out.println("Payment Details:\nNetBanking UserId:"+Payment.acc_id+"\nPayment Account: "+ Payment.paccount);
                System.out.println(this.ptype+" Rs."+this.pamnt+"/- is debited from your "+ Payment.paccount
                        + " account " + Payment.acc_id);
                System.out.println(this.ptype+"Payment Successfull...");
            }
            else{
                System.out.println("Wrong OTP Entered!...");
            }
        }
        else{
            System.out.println("Wrong id or password!...");
        }
    }

    public void getCardDetails(String card_no, int cvv, String user, int month, int year, int otp, String paccount, float pamnt) {
        
        this.card_no=card_no;
        this.cvv=cvv;
        this.user=user;
        this.month=month;
        this.year=year;
        this.otp1=otp;
        Payment.paccount = paccount;
        this.pamnt=pamnt;
        
        int length = String.valueOf(this.card_no).length();
        if(length>=12){
            if(this.month<=12 && this.year>21){
                if(this.otp1!=0 && this.cvv!=0){
                    System.out.println("Payment Details:\nCard No:"+this.card_no+"\nCard Valid: "+this.month+":"+this.year+"\nName:"+this.user+"\n Payment Account:"+ Payment.paccount);
                    System.out.println("\nDear "+this.user+" "+this.ptype+" "+this.pamnt+" is debited from your "+ Payment.paccount
                            + " acoount " + this.card_no);
                    System.out.println(this.ptype+"\nPayment Successfull!...");
                }
                else{
                    System.out.println("Wrong CVV or OTP!...");
                }
            }
            else{
                System.out.println("Wrong Card Valid Date!...");
            }
        }
        else{
            System.out.println("Invalid card Number!...");
        }
    }

    @Override
    public void getCardDetails(String card_no, int cvv, String user, int month, int year, int otp, String paccount) {

    }
    


}
