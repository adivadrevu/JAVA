package practice.exceptionhandling;

public class LaunchExceptionHandling {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println(k);
        
    }

}
