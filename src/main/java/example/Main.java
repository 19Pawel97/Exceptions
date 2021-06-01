package example;

public class Main {

    public static void main(String[] args) {

        try {
            doSth();
        } catch (CheckedJawny checkedJawny) {
            System.err.println("Exception found!");
            checkedJawny.printStackTrace();
        } finally {
            System.out.println("Doing it whether there is an exception or not.");
        }

        System.out.println("If there is an unchecked exception, it does not have to be dealt with.");
        doSthElse();

    }

    private static void doSthElse() {
        throw new UncheckedNiejawny("Unchecked Exception!");
    }

    private static void doSth() throws CheckedJawny {
        throw new CheckedJawny("Checked Exception!");
    }

}
