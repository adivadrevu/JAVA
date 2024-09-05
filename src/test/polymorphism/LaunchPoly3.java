package test.polymorphism;

class AeroPlane2
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
class CargoPlane2 extends AeroPlane2
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
class FighterPlane2 extends AeroPlane2
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

class PassengerPlane2 extends AeroPlane2
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

class Airport
{
	public void permit(AeroPlane2 aeroPlane)
	{
		aeroPlane.takingOff();//1:M
		aeroPlane.fly();
		aeroPlane.landing();
	}
}
public class LaunchPoly3 
{
	public static void main(String[] args)
	{
		CargoPlane2 cp=new CargoPlane2();
		
		FighterPlane2 fp=new FighterPlane2();
		
		PassengerPlane2 pp=new PassengerPlane2();		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);

	}

}
