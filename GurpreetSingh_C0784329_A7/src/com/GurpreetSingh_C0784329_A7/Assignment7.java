package com.GurpreetSingh_C0784329_A7;

/**
 * To run enter any account number which is same as .txt file name
 * Password is "gurpreet"
 */

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Assignment7 {
    static int accNum;
    public static void main(String[] args) throws IOException {
        //creating object of class
        Sample acc = new Sample();
        boolean verified = acc.checkUserCredits();
        accNum = acc.getAccountNumber();
        if (verified) {
            main_menu();
        }
    }

    // deposit money method
    public static void depositMoney() throws IOException {
        String filename = accNum + ".txt";
        float depositAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter amount you want to deposit"));
        File filename1 = new File(filename);
        //Reading file
        Scanner inputFile = new Scanner(filename1);
        while (inputFile.hasNext()) {
            String str = inputFile.nextLine();
            String balance = str;
            float newBalance = Float.parseFloat(balance) + depositAmount;

            //Writing to file
            FileWriter depositFileWriter = new FileWriter(filename);
            PrintWriter prt = new PrintWriter(depositFileWriter);
            prt.println(String.valueOf(newBalance));
            prt.close();
        }
    }

    // withdraw money method
    public static void withdraw() throws IOException {
        String firstName = accNum + ".txt";
        float withdrawAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter amount you want to withdraw"));
        File first_Name = new File(firstName);
        //Reading file
        Scanner file = new Scanner(first_Name);
        while (file.hasNext()) {
            String str = file.nextLine();
            String balance = str;
            float newBalance = Float.parseFloat(balance) - withdrawAmount;

            //Writing to file
            FileWriter withDrawFileWriter = new FileWriter(first_Name);
            PrintWriter prt = new PrintWriter(withDrawFileWriter);
            prt.println(String.valueOf(newBalance));
            prt.close();
        }
    }

    // check balance method
    public static void checkAccountBalance() throws FileNotFoundException {
        String firstName = accNum + ".txt";
        File first_Name = new File(firstName);
        //Reading file
        Scanner file = new Scanner(first_Name);
        while (file.hasNext()) {
            String str = file.nextLine();
            String balance = "Your balance is: " + str;
            JOptionPane.showMessageDialog(null, balance);
        }
    }

    //menu method
    public static void main_menu() throws IOException {
        int select = 0;
        select = Integer.parseInt(JOptionPane.showInputDialog("1. Deposit amount\n2.Withdraw amount\n3.Check Balance\n4.Quit\nPlease select a option"));
        //Switch case to check input
        switch (select) {
            case 1:
                depositMoney();
            case 2:
                withdraw();
            case 3:
                checkAccountBalance();
            case 4:
                System.exit(0);
            default:
                System.out.println("Select a valid option!!");
                break;
        }
    }
}

