
//In this class ‘accountNumber’ and ‘balance’ are attributes that represent the status of the account.
//While the methods ‘deposit’ and ‘withdraw’ define the actions that the account can perform.

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException1 {
        if (amount > this.balance) {
           throw new InsufficientFundsException1();
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
