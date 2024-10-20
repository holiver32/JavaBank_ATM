public class SavingsAccount extends Account {
    private double interesRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interesRate) {
        super(accountNumber, initialBalance);
        this.interesRate = interesRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interesRate;
        deposit(interest);
    }
}