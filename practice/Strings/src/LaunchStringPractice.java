public class LaunchStringPractice 
{
    public static void main(String[] args) 
    {
        String s1="Hello"; //String pool
        String s2="Hello"; //String pool
        String s3=new String("Hello"); //Heap
        String s4=new String("Hello"); //Heap
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s3.equals(s4)); //true
        System.out.println(s1 = s2);
        System.out.println(s1 = s3);
        System.out.println(s3 = s4);
        
    }
    
}
