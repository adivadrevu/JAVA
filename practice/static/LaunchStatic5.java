class Demo3
{
//	static int a;
//	
//	static
//	{
//		a=10;
//	}
	
//	static
//	{
//		System.out.println(a);
//	}
//	
//	static int a;
	
	static
	{
		disp();
	}
	
	static int a=10;
	
	public static void disp()
	{
		System.out.println(a);
	}
	
}

public class LaunchStatic5 
{

	public static void main(String[] args) 
	{
		Demo3.disp();
         Demo3 d=new Demo3();
         d.disp();
	}

}
