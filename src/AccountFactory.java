//this patterns useful for Singleton
public abstract class AccountFactory {
    public abstract Account creativeAccount(String accountType);
}

public class ConcreteAccountFactory extends AccountFactory {
    @Override
    public Account createAccount (String accountType) {
        switch (accountType) {
            case "Savings":
                return new SavingsAccount();
            case "Checking":
                return new CheckingAccount();
            default:
                throw new IllegalArgumentException("Unknown account type");
        }
    }
    // Example Factory Method
        public abstract Account createAccount(String accountType);
    }

    public class ConcreteAccountFactory extends AccountFactory {
        @Override
        public Account createAccount(String accountType) {
            switch (accountType) {
                case "Savings":
                    return new SavingsAccount();
                case "Checking":
                    return new CheckingAccount();
                default:
                    throw new IllegalArgumentException("Unknown account type");
            }
        }
}