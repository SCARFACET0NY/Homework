public class BankTwo extends Bank {
    private double rate1 = 0.01;
    private double rate2 = 0.03;
    private double rate3 = 0.06;
    private double rate4 = 0.10;
    private double rate5 = 0.15;
    private double maxRate = 0.21;

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
        double total = getTotal();
        double amount = getAmount();
        double duration = getDuration();
        cleanDeposit();

        if (daysAfterDeposit == duration) {
            return total;
        }

        return amount + (total - amount) * daysAfterDeposit / duration * 0.56;
    }
}
