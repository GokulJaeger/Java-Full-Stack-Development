package com.jsfd.week1.day2.Payment;

public interface PaymentDetails {
    String getAcctDetails(int acc_id, String acc_pwd, int otp, String paccount);
    String getCardDetails(String card_no, int cvv, String user, int day, int month, int otp, String paccount);
}
