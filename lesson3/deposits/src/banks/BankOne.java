package banks;

import banks.Bank;

public class BankOne extends Bank {
    private double rate1 = 0.03;
    private double rate2 = 0.06;
    private double rate3 = 0.09;
    private double rate4 = 0.12;
    private double rate5 = 0.15;
    private double maxRate = 0.18;

    @Override
    public void deposit(int amount, int duration) {
        setAmount(getAmount() + amount);
        setDuration(getDuration() + duration);
        if (getDuration() < 80) {
            setTotal(getTotal() + amount + (amount * rate1));
        } else if (getDuration() < 160) {
            setTotal(getTotal() + amount + (amount * rate2));
        } else if (getDuration() < 240) {
            setTotal(getTotal() + amount + (amount * rate3));
        } else if (getDuration() < 320) {
            setTotal(getTotal() + amount + (amount * rate4));
        } else if (getDuration() < 400) {
            setTotal(getTotal() + amount + (amount * rate5));
        } else {
            setTotal(getTotal() + amount + (amount * maxRate));
        }
    }

    @Override
    public double withdraw(int daysAfterDeposit) {
        double total = getTotal();
        double amount = getAmount();
        double duration = getDuration();
        cleanDeposit();

        if (daysAfterDeposit == duration) {
            return total;
        }

        return amount + (total - amount) * daysAfterDeposit / duration * 0.5;
    }
}
