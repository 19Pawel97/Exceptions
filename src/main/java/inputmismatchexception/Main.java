package inputmismatchexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        divide();
    }

    private static void divide() {
        Scanner scanner = new Scanner(System.in);
        Double number = null;
        Double number1 = null;
        do {
            try {
                System.out.println("Enter a number: ");
                number = scanner.nextDouble();
            } catch (InputMismatchException ime) {
                String token = scanner.next();
                System.out.println("Inappropriate input");
                number = null;
            }
        } while (number == null);

        do {
            try {
                System.out.println("Enter second number: ");
                number1 = scanner.nextDouble();
            } catch (InputMismatchException ime) {
                String token = scanner.next();
                System.out.println("Inappropriate input");
                number1 = null;
            }
        } while (number1 == null);

        System.out.println(number / number1);
    }


}
