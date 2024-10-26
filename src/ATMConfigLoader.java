// Ejemplo de Checked Exception
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ATMConfigLoader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
            String line = reader.readLine();
            System.out.println("Configuración: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error de I/O: " + e.getMessage());
        }
    }
    // Ejemplo de Unchecked Exception
    public class ATM {
        public static void main(String[] args) {
            String accountNumber = null;
            System.out.println(accountNumber.length()); // Esto es una excepción unchecked ya que no se puede saber el .length() de un String nulo.
        }
    }
}
