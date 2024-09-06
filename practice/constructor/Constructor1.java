package practice.constructor;

class Student
{
    int rollno;
    String name;
    float marks;

    Student()
    {
        System.out.println("Zero-argument constructor called");
    }

    Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
        System.out.println("Parameterized constructor with 2 arguments called");
    }

    Student(int rollno, String name, float marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        System.out.println("Parameterized constructor with 3 arguments called");
    }
}

public class Constructor1 
{
    public static void main(String[] args) 
    {
        Student student = new Student();
        Student student1 = new Student(29,"Aditya");
        Student student2 = new Student(99,"AdityaVadrevu", 99.99f);
        
    }

}
