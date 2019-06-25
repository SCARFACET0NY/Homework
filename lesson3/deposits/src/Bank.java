public abstract class Bank {
    private int amount;
    private int duration ;
    private double total = 0;

    public Bank(int amount, int duration) {
        this.amount = amount;
        this.duration = duration;
    }

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
}
