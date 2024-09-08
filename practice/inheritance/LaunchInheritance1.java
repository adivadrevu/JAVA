package practice.inheritance;

class Telusko
{
	int age;
	
	void disp()
	{
		age=10;
		System.out.println("Telusko is "+ age+" year old");
	}
}
class Alien extends Telusko
{
	
	
}

//class Demo1
//{
//	
//}
//class Demo2 extends Demo1
//{
//	
//}
public class LaunchInheritance1 
{

	public static void main(String[] args)
	{
//		Telusko t=new Telusko();
//		t.disp();
		
		Alien a=new Alien();
		a.disp();

	}

}

