//class Demo
//{
//	static int a, b,c;
////	static int b;
////	int x,y,z;
//	
//	static
//	{
//		System.out.println("Static Init block");
//		a=10;
//		b=20;
//		c=30;
//	}
//	static void disp()
//	{
//		System.out.println("a : "+a);
//		System.out.println("b : "+b);
//		System.out.println("c : "+c);
//	}
//			
//}

public class LaunchStatic1 
{
	static int a;
	
	static
	{
		a=10;
		System.out.println("a : "+ a);
		System.out.println("Static block");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method");
		//Demo.disp();

	}

}
