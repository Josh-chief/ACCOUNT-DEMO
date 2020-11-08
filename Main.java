package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account1=new Account(560000.50);
        System.out.println("your account has been created. ");
        System.out.println("Your initial balance is :"+account1.getBalance());
        System.out.println("please enter the  amount you like to withdraw ?:");

        Scanner myScanner = new Scanner(System.in);
        double amnt = myScanner.nextDouble();
        System.out.println("You have withdrawn :"+amnt+"and your balance is :"+account1.withdraw(amnt));

    }
}
