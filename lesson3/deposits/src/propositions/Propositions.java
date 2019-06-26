package propositions;

import banks.BankFour;
import banks.BankOne;
import banks.BankThree;
import banks.BankTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Propositions {
    private BankOne bankOne = new BankOne();
    private BankTwo bankTwo = new BankTwo();
    private BankThree bankThree = new BankThree();
    private BankFour bankFour = new BankFour();

    public String bestDeposit50days = bestDeposit(100, 50);
    public String bestDeposit100days = bestDeposit(100, 100);
    public String bestDeposit150days = bestDeposit(100, 150);
    public String bestDeposit200days = bestDeposit(100, 200);
    public String bestDeposit250days = bestDeposit(100, 250);
    public String bestDeposit300days = bestDeposit(100, 300);
    public String bestDeposit350days = bestDeposit(100, 350);
    public String bestDeposit400days = bestDeposit(100, 400);
    public String bestDeposit450days = bestDeposit(100, 450);
    public String bestDeposit500days = bestDeposit(100, 500);
    public String bestDeposit1000days = bestDeposit(100, 1000);

    public String bestDeposit(int amount, int days) {
        createDeposits(amount, days);

        HashMap<Double, String> map = new HashMap<>();
        map.put(bankOne.getTotal(), bankOne.getClass().getSimpleName());
        map.put(bankTwo.getTotal(), bankTwo.getClass().getSimpleName());
        map.put(bankThree.getTotal(), bankThree.getClass().getSimpleName());
        map.put(bankFour.getTotal(), bankFour.getClass().getSimpleName());

        double max = Math.max(Math.max(bankOne.getTotal(), bankTwo.getTotal()),
                Math.max(bankThree.getTotal(), bankFour.getTotal()));

        cleanDeposits();

        return map.get(max);
    }

    public String bestWithdrawal(int amount, int depositDays, int withdrawAfter) {
        createDeposits(amount, depositDays);
        double withdraw1 = bankOne.withdraw(withdrawAfter);
        double withdraw2 = bankTwo.withdraw(withdrawAfter);
        double withdraw3 = bankThree.withdraw(withdrawAfter);
        double withdraw4 = bankFour.withdraw(withdrawAfter);

        HashMap<Double, String> map = new HashMap<>();
        map.put(withdraw1, bankOne.getClass().getSimpleName());
        map.put(withdraw2, bankTwo.getClass().getSimpleName());
        map.put(withdraw3, bankThree.getClass().getSimpleName());
        map.put(withdraw4, bankFour.getClass().getSimpleName());

        double max = Math.max(Math.max(withdraw1, withdraw2),
                Math.max(withdraw3, withdraw4));

        return map.get(max);
    }

    public void sortDepositsFromBestToWorst(int amount, int days) {
        createDeposits(amount, days);

        HashMap<Double, String> map = new HashMap<>();
        map.put(bankOne.getTotal(), bankOne.getClass().getSimpleName());
        map.put(bankTwo.getTotal(), bankTwo.getClass().getSimpleName());
        map.put(bankThree.getTotal(), bankThree.getClass().getSimpleName());
        map.put(bankFour.getTotal(), bankFour.getClass().getSimpleName());

        Double[] totals = new Double[] {bankOne.getTotal(), bankTwo.getTotal(), bankThree.getTotal(), bankFour.getTotal()};
        Arrays.sort(totals, Collections.reverseOrder());

        for (double total : totals) {
            System.out.println(map.get(total) + " return from deposit will be " + total);
        }

        cleanDeposits();
    }

    private void createDeposits(int amount, int days) {
        bankOne.deposit(amount, days);
        bankTwo.deposit(amount, days);
        bankThree.deposit(amount, days);
        bankFour.deposit(amount, days);
    }

    private void cleanDeposits() {
        bankOne.cleanDeposit();
        bankTwo.cleanDeposit();
        bankThree.cleanDeposit();
        bankFour.cleanDeposit();
    }
}
