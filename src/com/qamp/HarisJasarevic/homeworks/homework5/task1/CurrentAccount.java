package com.qamp.HarisJasarevic.homeworks.homework5.task1;

public class CurrentAccount extends BankAccounts{

    protected CurrentAccount(final AccountOwner accountOwner, final String serialNumber, final int passCode) {
        super(accountOwner, serialNumber, passCode);
    }

    @Override
    public double moneyWithdraw (final double withdrawAmount) {
        balance -= withdrawAmount;
        return balance;
    }

    @Override

    public double moneyDeposit (final double depositAmount) throws IllegalStateException {
        balance += depositAmount;
        return balance;
    }

    @Override

    public void reset () {
    }

    @Override

    public String showAccountState () {
        return "Owner information: {" + accountOwner.getFirstName() + "}, " + accountOwner.getLastName() + ", "
                + accountOwner.getAddress() + "\n" + "Current balance: " + balance;
    }
}
