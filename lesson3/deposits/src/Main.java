import banks.BankOne;
import propositions.Propositions;

public class Main {
    public static void main(String[] args) {
        Propositions propositions = new Propositions();

        System.out.println(propositions.bestDeposit(25000, 420));
        System.out.println(propositions.bestWithdrawal(2200, 240, 160));

        System.out.println(propositions.bestDeposit50days);
        System.out.println(propositions.bestDeposit100days);
        System.out.println(propositions.bestDeposit150days);
        System.out.println(propositions.bestDeposit200days);
        System.out.println(propositions.bestDeposit250days);
        System.out.println(propositions.bestDeposit300days);
        System.out.println(propositions.bestDeposit350days);
        System.out.println(propositions.bestDeposit400days);
        System.out.println(propositions.bestDeposit450days);
        System.out.println(propositions.bestDeposit500days);
        System.out.println(propositions.bestDeposit1000days);

        propositions.sortDepositsFromBestToWorst(1500, 250);

        BankOne bankOne = new BankOne();

        bankOne.deposit(1000, 150);
        System.out.println(bankOne.getTotal());

        bankOne.deposit(2500, 120);
        System.out.println(bankOne.getTotal());

        System.out.println(bankOne.withdraw(180));
        System.out.println(bankOne.getTotal());
    }
}
