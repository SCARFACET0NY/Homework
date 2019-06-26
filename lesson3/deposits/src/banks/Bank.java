package banks;

public abstract class Bank {
    private int amount = 0;
    private int duration = 0;
    private double total = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public abstract void deposit(int amount, int duration);

    public abstract double withdraw(int daysAfterDeposit);

    public void cleanDeposit() {
        setAmount(0);
        setDuration(0);
        setTotal(0);
    }
}
