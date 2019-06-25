public class BankOne extends Bank {
    private double rate1 = 0.03;
    private double rate2 = 0.06;
    private double rate3 = 0.09;
    private double rate4 = 0.12;
    private double rate5 = 0.15;
    private double maxRate = 0.18;

    public BankOne(int amount, int duration) {
        super(amount, duration);
        deposit(amount, duration);
    }

    @Override
    public void deposit(int amount, int duration) {
        setAmount(getAmount() + amount);
        setDuration(getDuration() + duration);
        if (duration < 100) {
            setTotal(getTotal() + amount + (amount * rate1));
        } else if (duration < 200) {
            setTotal(getTotal() + amount + (amount * rate2));
        } else if (duration < 300) {
            setTotal(getTotal() + amount + (amount * rate3));
        } else if (duration < 400) {
            setTotal(getTotal() + amount + (amount * rate4));
        } else if (duration < 500) {
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
