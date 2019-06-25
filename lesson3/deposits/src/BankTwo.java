public class BankTwo extends Bank {
    private double rate1 = 0.01;
    private double rate2 = 0.03;
    private double rate3 = 0.06;
    private double rate4 = 0.10;
    private double rate5 = 0.15;
    private double maxRate = 0.21;

    public BankTwo(int amount, int duration) {
        super(amount, duration);
        deposit(amount, duration);
    }

    @Override
    public void deposit(int amount, int duration) {
        setAmount(getAmount() + amount);
        setDuration(getDuration() + duration);
        if (duration < 80) {
            setTotal(getTotal() + amount + (amount * rate1));
        } else if (duration < 160) {
            setTotal(getTotal() + amount + (amount * rate2));
        } else if (duration < 240) {
            setTotal(getTotal() + amount + (amount * rate3));
        } else if (duration < 320) {
            setTotal(getTotal() + amount + (amount * rate4));
        } else if (duration < 400) {
            setTotal(getTotal() + amount + (amount * rate5));
        } else {
            setTotal(getTotal() + amount + (amount * maxRate));
        }
    }

    @Override
    public double withdraw(int daysAfterDeposit) {
        if (daysAfterDeposit == getDuration()) {
            return getTotal();
        }
        return getAmount() + (getTotal() - getAmount()) * daysAfterDeposit / getDuration() * 0.8;
    }
}
