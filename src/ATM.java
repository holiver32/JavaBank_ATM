// Combining the basic concepts of variables, operators and control structures we have built a step-by-Step
// calculator and integrated it into our Java code.
import java.util.Scanner;

public class ATM {
    private Calculator calculator = new Calculator();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcometo JavaBank ATM.");
            System.out.println("Please Select an opcion");
            System.out.println("1. Make to Trasaction.");
            System.out.println("2. Use Calculator.");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // logic trasaction
                    break;
                case 2:
                    calculator.start();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. ");
            }
        }
    scanner.close();
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}