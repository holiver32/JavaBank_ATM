// example patron Adapter
public interface PaymentGateway {
        void pay(double amount);
    }

    public class PayPalAdapter implements PaymentGateway {
        private PayPal payPal;

        public PayPalAdapter(PayPal payPal) {
            this.payPal = payPal;
        }

        @Override
        public void pay(double amount) {
            payPal.sendPayment(amount);
        }
    }
// example patron Composite
import java.util.ArrayList;
import java.util.List;

public interface Transaction {
    void execute();
}

public class SimpleTransaction implements Transaction {
    private String description;

    public SimpleTransaction(String description) {
        this.description = description;
    }

    @Override
    public void execute() {
        System.out.println("Executing: " + description);
    }
}

public class CompositeTransaction implements Transaction {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public void execute() {
        for (Transaction t : transactions) {
            t.execute();
        }
    }
}
// Strategy Method of behavior
public interface AuthStrategy {
    boolean authenticate(String data);
}

public class PinAuthStrategy implements AuthStrategy {
    private String pin;

    public PinAuthStrategy(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean authenticate(String data) {
        return this.pin.equals(data);
    }
}

public class BiometricAuthStrategy implements AuthStrategy {
    private String biometricData;

    public BiometricAuthStrategy(String biometricData) {
        this.biometricData = biometricData;
    }

    @Override
    public boolean authenticate(String data) {
        return this.biometricData.equals(data);
    }
}

public class ATM {
    private AuthStrategy authStrategy;

    public void setAuthStrategy(AuthStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public boolean authenticateUser(String data) {
        return authStrategy.authenticate(data);
    }
}
