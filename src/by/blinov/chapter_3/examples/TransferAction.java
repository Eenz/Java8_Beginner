package by.blinov.chapter_3.examples;

import by.blinov.chapter_3.examples.Account;

public class TransferAction {
    private double transactionAmount;

    public TransferAction(double amount) {
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean transferIntoAccount(Account from, Account to) {
        double demand = from.getAmount() - transactionAmount;
        if (demand >= 0) {
            from.setAsset(demand);
            to.adAsset(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double getTransactionAmmount() {
        return transactionAmount;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
