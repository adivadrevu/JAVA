class Alien
{
	static
	{
		System.out.println("SB1");
	}
	static
	{
		System.out.println("SB2");

	}
	
	
	{
		System.out.println("NSb1");
	}
	
	
	{
		System.out.println("NSb2");
	}
	
}

public class LaunchStatic4 
{

	public static void main(String[] args) 
	{
		Alien a1=new Alien();
		
		
		Alien a2=new Alien();


	}

}
