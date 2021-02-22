package com.jsfd.week1.day2.Payment;

public interface PaymentDetails {
    void getAcctDetails(int acc_id, String acc_pwd, int otp, String paccount, float pamnt);
    void getCardDetails(String card_no, int cvv, String user, int month, int year, int otp, String paccount);
}
