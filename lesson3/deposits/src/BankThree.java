public class BankThree extends Bank {
    private double rate1 = 0.05;
    private double rate2 = 0.08;
    private double rate3 = 0.11;
    private double rate4 = 0.13;
    private double rate5 = 0.15;
    private double maxRate = 0.16;

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
        double total = getTotal();
        double amount = getAmount();
        double duration = getDuration();
        cleanDeposit();

        if (daysAfterDeposit == duration) {
            return total;
        }

        return amount + (total - amount) * daysAfterDeposit / duration * 0.59;
    }
}
