package by.blinov.chapter_3.examples;

public class Account {
    private long id;
    private double amount;

    public Account() {
        super();
    }

    public Account(long id) {
        super();
        this.id = id;
    }

    public Account(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }


    public void setAsset(double demand) {
        this.amount = demand;

    }

    public void adAsset(double transactionAmmount) {
        this.amount += (transactionAmmount * 0.98);
    }
}

