// In the following code a user authentication with a limit of three attempts is made.
public class Main {
    int pin = 1234;
public boolean authenticateUser(String inputPin) {
    int attempts = 0;
    while (attempts < 3) {
        if (this.pin.equals(inputPin)) {
            return true;
        } else {
            attempts++;
            System.out.println("Pin incorrecto. Intento" + attempts +" de 3.");
        }
    }
    return false;
}
}