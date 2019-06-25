public class BankThree extends Bank {
    private double rate1 = 0.05;
    private double rate2 = 0.08;
    private double rate3 = 0.11;
    private double rate4 = 0.13;
    private double rate5 = 0.15;
    private double maxRate = 0.16;

    public BankThree(int amount, int duration) {
        super(amount, duration);
        deposit(amount, duration);
    }


    @Override
    public void deposit(int amount, int duration) {
        setAmount(getAmount() + amount);
        setDuration(getDuration() + duration);
        if (duration < 90) {
            setTotal(getTotal() + amount + (amount * rate1));
        } else if (duration < 180) {
            setTotal(getTotal() + amount + (amount * rate2));
        } else if (duration < 270) {
            setTotal(getTotal() + amount + (amount * rate3));
        } else if (duration < 360) {
            setTotal(getTotal() + amount + (amount * rate4));
        } else if (duration < 450) {
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
