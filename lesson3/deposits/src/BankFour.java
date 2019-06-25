public class BankFour extends Bank {
    private double rate1 = 0.04;
    private double rate2 = 0.07;
    private double rate3 = 0.10;
    private double rate4 = 0.13;
    private double rate5 = 0.16;
    private double maxRate = 0.19;

    public BankFour(int amount, int duration) {
        super(amount, duration);
        deposit(amount, duration);
    }

    @Override
    public void deposit(int amount, int duration) {
        setAmount(getAmount() + amount);
        setDuration(getDuration() + duration);
        if (duration < 110) {
            setTotal(getTotal() + amount + (amount * rate1));
        } else if (duration < 220) {
            setTotal(getTotal() + amount + (amount * rate2));
        } else if (duration < 330) {
            setTotal(getTotal() + amount + (amount * rate3));
        } else if (duration < 440) {
            setTotal(getTotal() + amount + (amount * rate4));
        } else if (duration < 550) {
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
