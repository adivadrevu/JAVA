package practice.polymorphism;



class AeroPlane1
{
	public void takingOff()
	{
		System.out.println("Aeroplane must takeOff in order to fly");
	}
	
	public void fly()
	{
		System.out.println("AeroPlane is flying");
	}
	
	public void landing()
	{
		System.out.println("Aeroplane is landing");
	}
}
class CargoPlane1 extends AeroPlane1
{
	public void takingOff()
	{
		System.out.println("CargoPlane requires longer runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("cargoPlane is flying");
	}
	public void landing()
	{
		System.out.println("cargoplane is landing");
	}
	
}
class FighterPlane1 extends AeroPlane1
{
	public void takingOff()
	{
		System.out.println("FighterPlane requires shorter runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("fighterPlane is flying");
	}
	public void landing()
	{
		System.out.println("fighterplane is landing");
	}
	
}

class PassengerPlane1 extends AeroPlane1
{
	public void takingOff()
	{
		System.out.println("PassengerPlane1 requires meidum runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("PassengerPlane1 is flying");
	}
	public void landing()
	{
		System.out.println("PassengerPlane1 is landing");
	}
	
}
public class LaunchPoly2 
{

	public static void main(String[] args)
	{
		CargoPlane1 cp=new CargoPlane1();
		
	
		
		FighterPlane1 fp=new FighterPlane1();
		

		
		PassengerPlane1 pp=new PassengerPlane1();
		
	
		
		AeroPlane1 aeroPlane;
		
		aeroPlane=cp;
		
		aeroPlane.takingOff();
		aeroPlane.fly();
		aeroPlane.landing();
		
		System.out.println("**********************");
		
		aeroPlane=fp;
		
		aeroPlane.takingOff();//1:M
		aeroPlane.fly();
		aeroPlane.landing();
		
		System.out.println("********************");
		
		aeroPlane=pp;
		
		aeroPlane.takingOff();//1:M
		aeroPlane.fly();
		aeroPlane.landing();
		
		
		
		
		

	}

}
