package practice.exceptionhandling;

public class MyException extends Exception {

    public MyException(String message) {

        super(message);

    }

public class LaunchCustomException {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        try {
            if (j == 0) {
                throw new MyException("Cannot divide by zero");
            }
            k = i / j;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(k);
    }

}
