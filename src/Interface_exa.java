//This structure allows different components of the JavaBank system,
// such as ATMs and different types of accounts, to implement consistent authentication mechanisms.

public interface Authenticatable {
    boolean authenticate(String pin);
}

public class ATM implements Authenticatable {
    @Override
    public boolean authenticate(String pin) {
        // Lógica de autenticación...
        return true; // o false según el caso
    }
}
