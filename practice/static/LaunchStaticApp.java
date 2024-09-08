import java.util.Scanner;

class Farmer
{
	float pa;
	float td;
	float si;
	
	static float roi;
	static
	{
		roi=2.5f;
	}
	
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly Enter the loan amount required in rupees");
		pa=scan.nextFloat();
		System.out.println("Kindly enter time duration required to repay loan in months");
		td=scan.nextFloat();
		
	}
	
	void compute()
	{
		si=(pa*td*roi)/100.0f;
	}
	
	void disp()
	{
		System.out.println("Hello, Your SI is : "+ si);
	}
	
}

public class LaunchStaticApp 
{

	public static void main(String[] args) 
	{
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();

		Farmer f3=new Farmer();
		
		System.out.println("Farmer1: ");
		f1.acceptInput();
		f1.compute();
		f1.disp();
		
		System.out.println();
		System.out.println("Farmer2: ");
		f2.acceptInput();
		f2.compute();
		f2.disp();
		
		System.out.println();
		System.out.println("Farmer3: ");
		f3.acceptInput();
		f3.compute();
		f3.disp();


	}

}
