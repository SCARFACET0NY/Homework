public class BestProposition {
    private BankOne bankOne;
    private BankTwo bankTwo;
    private BankThree bankThree;
    private BankFour bankFour;

    public void bestProposition(int amount, int days) {
        BankOne bankOne = new BankOne(amount, days);
        BankTwo bankTwo = new BankTwo(amount, days);
        BankThree bankThree = new BankThree(amount, days);
        BankFour bankFour = new BankFour(amount, days);

        double max = Math.max(Math.max(bankOne.getTotal(), bankTwo.getTotal()),
                Math.max(bankThree.getTotal(), bankFour.getTotal()));
        
        System.out.println(max);
    }
}
