public class Main {
    public static void main(String[] args) {
//Variables basicas
        String accountNumber = "12346789";
        double balance = "123456789";
        int pin = 1234;
// array de montos de transacciones
        int[] transaction {
            200, -100, 50
        } ;

//Operaciones con variables
        balance += transactionAmounts[0]; //Deposit
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso Concedido")
        }

//Uso de operadores
        balance++; //Increment
        String status = (balance < 0) ? "Deuda" : "Credito";
        System.out.println("Estado de cuenta: " + status);
    }
    }