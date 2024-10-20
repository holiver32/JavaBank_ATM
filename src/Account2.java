//This structure allows JavaBank to handle different types of bank accounts,
// each with its own implementation of these methods, while ensuring that all accounts handle these same essential attributes.
public abstract class Account2 {
    private String accountNumber;
    private double balance;
    private String pin;

    public Account2(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;
    public abstract void deposit(double amount);
    @Override
    public boolean authenticate(String pin) {
        return this.pin.equals(pin);
    }
}

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance, String pin) {
        super(accountNumber, balance, pin);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        // Lógica específica para SavingsAccount...
    }

    @Override
    public void deposit(double amount) {
        // Implementación...
    }
}
