package dividingbyzero;

public class Main {

    public static void main(String[] args) {

        System.out.println(divide(1d, 0d));
        System.out.println(divide(1d, 0.5d));

        try {
            System.out.println(divide(1, 0));
        } catch (ArithmeticException ae) {
            System.err.println(ae.getMessage());
        }
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.err.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
            return 0;
        } else {
            return a / b;
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
