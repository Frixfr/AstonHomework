package homework1.task2.model;

public class CreditCard {
    private final String number;
    private double amount;
    private boolean expired;

    public CreditCard(String number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isExpired() {
        return expired;
    }
}
