// Let's define the necessary variables for our calculator that will be able to perform basic
// operations such as addition, subtraction, multiplication and division within our ATM.
import java.util.Scanner;

public class Calculator {
   private Scanner scanner = new Scanner(System.in);

   public void start() {
       System.out.print("Enter first number: ");
       double num1 = scanner.nextDouble();

       System.out.print("Enter second number: ");
       double num2 = scanner.nextDouble();

       System.out.print("Choose Operation ( + - * /): ");
       String operator = scanner.next();

       double result;
       switch (operator) {
           case "+":
               result = add(num1, num2);
               break;
           case "-":
               result = subtract(num1, num2);
               break;
           case "*":
               result = multiply(num1, num2);
               break;
           case "/":
               result = divide(num1, num2);
               break;
           default:
               throw new IllegalArgumentException("Operation invalid.");
       }
       System.out.println("The result: " + result);
   }
    public double add (double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b !=0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divide for zero is impossible.");
        }
}
public static void main(String[] args) {
   Calculator calculator = new Calculator();
   calculator.start();
   }
}