package dividingbyzeromyexception;

public class Main {

    public static void main(String[] args) {
        divide(1,0);
        divide(10,5);
    }

    public static void divide(double a, double b) {
        if (b == 0) {
            throw new CholeraException();
        } else {
            System.out.println(a / b);
        }
    }

}
