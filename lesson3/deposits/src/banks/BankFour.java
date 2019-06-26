package banks;

import banks.Bank;

public class BankFour extends Bank {
    private double rate1 = 0.04;
    private double rate2 = 0.07;
    private double rate3 = 0.10;
    private double rate4 = 0.13;
    private double rate5 = 0.16;
    private double maxRate = 0.19;

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
        double total = getTotal();
        double amount = getAmount();
        double duration = getDuration();
        cleanDeposit();

        if (daysAfterDeposit == duration) {
            return total;
        }

        return amount + (total - amount) * daysAfterDeposit / duration * 0.53;
    }
}
