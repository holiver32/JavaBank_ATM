// Used Try-Cash to encapsulate cod
public class InsufficientFundsException3 extends Exception {
    public InsufficientFundsException(String errorMessage) {
        super(errorMessage);
    }
}

public void withdraw(double amount) throws InsufficientFundsException {
    if (balance < amount) {
        throw new InsufficientFundsException("Fondos insuficientes");
    }
    balance -= amount;
}

public void performTransaction(String accountNumber, Transaction.TransactionType type, double amount) {
    try {
        if (type == Transaction.TransactionType.WITHDRAWAL) {
            accounts.get(accountNumber).withdraw(amount);
            System.out.println("Retiro exitoso");
        }
    } catch (InsufficientFundsException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        // Registro de la transacción
    }
    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
