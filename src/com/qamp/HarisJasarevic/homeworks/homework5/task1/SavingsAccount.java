package com.qamp.HarisJasarevic.homeworks.homework5.task1;

public class SavingsAccount extends BankAccounts {

    private double dailyTransactionLimit;
    private int transactionsLeft;

    protected SavingsAccount (final AccountOwner accountOwner, final String serialNumber, final int passCode, final int dailyTransactionLimit) {
        super(accountOwner, serialNumber, passCode);
        this.dailyTransactionLimit = dailyTransactionLimit;
        this.transactionsLeft = 3;
    }

    @Override

    public double moneyWithdraw (final double withdrawAmount) throws IllegalStateException {
        if (accountBalance - withdrawAmount < 0) {
            throw new IllegalStateException("There is no enough funds available!");
        }
        if (withdrawAmount > dailyTransactionLimit) {
            throw new IllegalStateException("Withdrawal amount exceeds the daily transaction limit!");
        }
        if (transactionsLeft <= 0) {
            throw new IllegalStateException("You exceeded the limit of daily transactions!");
        }
        accountBalance -= withdrawAmount;
        transactionsLeft--;
        return accountBalance;
    }

    @Override

    public double moneyDeposit (final double depositAmount) throws IllegalStateException {
        if (transactionsLeft <= 0) {
            throw new IllegalStateException("Cannot deposit due to daily number of transactions limit exceeded");
        }
        accountBalance += depositAmount;
        transactionsLeft--;
        return accountBalance;
    }

    @Override
    public void reset () {
        this.dailyTransactionLimit = 1000;
        this.transactionsLeft = 3;
    }

    @Override
    public String showAccountState () {
        return "Owner information: {" + accountOwner.getFirstName() + "}, " + accountOwner.getLastName() + ", "
                + accountOwner.getAddress() + "\n" + "Current balance: " + accountBalance + "\n"
                + "Current daily limit: {" + dailyTransactionLimit + "}, " + "numberOfAvailableTransactions {" + transactionsLeft + "}";
    }
}
