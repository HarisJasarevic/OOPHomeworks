package com.qamp.HarisJasarevic.homeworks.homework5.task1;

public abstract class BankAccounts {

    protected AccountOwner accountOwner;
    protected String serialNumber;
    protected int passCode;
    protected double accountBalance;

    public BankAccounts(final AccountOwner accountOwner, final String serialNumber, final int passCode) {
        this.accountOwner = accountOwner;
        this.serialNumber = serialNumber;
        this.passCode = passCode;
        this.accountBalance = 0;
    }

    public abstract double moneyWithdraw ( final double withdrawAmount) throws IllegalStateException;
    public abstract double moneyDeposit (final  double depositAmount) throws IllegalStateException;
    public abstract void reset ();
    public abstract String showAccountState ();
}
