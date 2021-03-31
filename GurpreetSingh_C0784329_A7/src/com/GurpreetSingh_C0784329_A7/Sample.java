//To run execute Assignment7.java file

package com.GurpreetSingh_C0784329_A7;

import javax.swing.*;
import java.io.IOException;

public class Sample {
    static int accountNumber;
    String password;
    float balance;

    //constructor
    public Sample() {
    }

    //constructor overload
    public Sample(int accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
    }

    //Getter and Setter methods

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    //Check user credentials method
    public static boolean checkUserCredits() throws IOException {
        String user_password="gurpreet";
        //boolean value to validate user credentials
        boolean isValid = false;
        accountNumber= Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the account number: "));
        String user_inputPassword = JOptionPane.showInputDialog(null, "Please Enter password: ");
        //comparing user_input with actual password
        if (user_inputPassword.equals(user_password)){
            isValid = true;
        }else{
            JOptionPane.showMessageDialog(null, "Wrong Password! Try Again");
        }
        return isValid;
    }
}
