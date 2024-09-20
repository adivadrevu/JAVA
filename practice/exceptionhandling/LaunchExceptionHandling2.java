package practice.exceptionhandling;

public class LaunchExceptionHandling2 {
    public static void main(String[] args) {
        
        String Name = "Sachin";

        try {
            System.out.println(Name.charAt(6));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds");
        }
    }

}
