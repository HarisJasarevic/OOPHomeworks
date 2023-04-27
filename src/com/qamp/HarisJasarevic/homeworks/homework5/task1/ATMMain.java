package com.qamp.HarisJasarevic.homeworks.homework5.task1;

import java.util.Scanner;

public class ATMMain {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM();

        AccountOwner accountOwner = new AccountOwner("Bukayo", "Saka", "1st London Street");
        AccountOwner accountOwner1 = new AccountOwner("Martin", "Odegard", "2nd London Street");

        BankAccounts bankAccount = new CurrentAccount(accountOwner, "777Bukayo", 7777);
        BankAccounts bankAccount1 = new SavingsAccount(accountOwner1, "888Martin", 8888, 3);

        atm.addAccount(bankAccount);
        atm.addAccount(bankAccount1);

        while (true) {
            System.out.println("Enter 1 to withdraw money:");
            System.out.println("Enter 2 to deposit money:");
            System.out.println("Enter 3 to reset account:");
            System.out.println("Enter 4 to show account state:");
            System.out.println("Enter 5 to exit the program:");

            int choice = scanner.nextInt();

            if (choice == 1) {
                try {
                    System.out.println("Enter amount for withdrawal: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.println("Enter valid serial number: ");
                    String serialNumber = scanner.next();
                    System.out.println("Enter valid account passcode: ");
                    int passCode = scanner.nextInt();
                    double newBalance = atm.moneyWithdraw(withdrawAmount, serialNumber, passCode);
                    System.out.println("New account balance is: " + newBalance);
                }catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                try {
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.println("Enter valid serial number; ");
                    String serialNumber = scanner.next();
                    System.out.println("Enter valid passcode: ");
                    int passCode = scanner.nextInt();
                    double newBalance = atm.moneyDeposit(depositAmount, serialNumber, passCode);
                    System.out.println("New account balance is: " + newBalance);
                }catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 3) {
                try {
                    System.out.println("Enter valid account serial number: ");
                    String serialNumber = scanner.next();
                    System.out.println("Enter valid passcode: ");
                    int passCode = scanner.nextInt();
                    atm.reset(serialNumber, passCode);
                    System.out.println("Account reset successful!");
                }catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 4) {
                try {
                    System.out.println("Enter valid account serial number: ");
                    String serialNumber = scanner.next();
                    System.out.println("Enter valid passcode: ");
                    int passCode = scanner.nextInt();
                    String accountState = atm.showAccountState(serialNumber, passCode);
                    System.out.println(accountState);
                }catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }else {
                System.out.println("Invalid choice. Please enter number 1 to 5: ");
            }
        }
    }
}
