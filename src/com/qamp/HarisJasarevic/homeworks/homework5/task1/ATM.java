package com.qamp.HarisJasarevic.homeworks.homework5.task1;


import java.util.ArrayList;
import java.util.List;

public class ATM {

    private List<BankAccounts> accounts;

    public ATM () {
        this.accounts = new ArrayList<>();
    }

    public double moneyWithdraw (final double withdrawAmount, final String serialNumber, final int passCode) {
        final BankAccounts account = getAccount(serialNumber, passCode);
        return account.moneyWithdraw(withdrawAmount);
    }

    public double moneyDeposit ( final double depositAmount, final String serialNumber, final int passCode) {
        final BankAccounts account = getAccount (serialNumber, passCode);
        return account.moneyDeposit(depositAmount);
    }

    public void reset (final String serialNumber, final int passCode) throws IllegalStateException {
        final BankAccounts account = getAccount (serialNumber, passCode);
        account.reset();
    }

    public String showAccountState (final String serialNumber, final int passCode) throws IllegalStateException {
        final BankAccounts account = getAccount (serialNumber, passCode);
        return account.showAccountState();
    }

    private BankAccounts getAccount(final String serialNumber, final int passCode) throws IllegalStateException {
        for (BankAccounts account : accounts) {
            if (account.serialNumber.equals(serialNumber)) {
                if (passCode >= 1000 && passCode <= 9999) {
                    if (account.passCode == passCode) {
                        return account;
                    }else {
                        throw new IllegalStateException("Incorrect passcode for this account!");
                    }
                }else {
                    throw new IllegalStateException("Incorrect passcode entered!");
                }
            }
        }
        throw new IllegalStateException("Account with provided serial number is not found!");
    }

    public void addAccount (final BankAccounts account) {
        this.accounts.add(account);
    }
}
