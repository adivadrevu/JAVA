class Student
{
	int id;
	String name;
	String city;
	
	static int count;
	
	Student()
	{
		System.out.println("Zero param cons");
		count++;
	}
	
	Student(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		count++;
	}
		
}

public class LaunchStatic3 
{

	public static void main(String[] args) 
	{
		
		Student st1=new Student(1, "Rohan", "Bengaluru");
		System.out.println("no of objects created  : "+ Student.count);
		
		Student st2=new Student(2, "Rohit", "Mumbai");
		System.out.println("no of objects created  : "+ Student.count);

		
		Student st3=new Student(3, "Ramesh", "Chennai");
		System.out.println("no of objects created  : "+ Student.count);



	}

}
