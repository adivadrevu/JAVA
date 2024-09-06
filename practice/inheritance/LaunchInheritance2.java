package practice.inheritance;
class AeroPlane //extends  Object
{
	void fly()
	{
		System.out.println("AeroPlane flies");
	}
	void landing()
	{
		System.out.println("AeroPlane is landing");
	}
}
class CargoPlane //extends Object
{
	
}

//class CommercialPlane extends CargoPlane, AeroPlane //extends AeroPlane class cannot extends multiple classes
//{
//	
//}

class PassengerPlane extends AeroPlane
{
	
}

public class LaunchInheritance2 
{

	public static void main(String[] args) 
	{
//		CargoPlane cp=new CargoPlane();
//		cp.fly();
//		cp.landing();
		
		
		
		PassengerPlane pp=new PassengerPlane();
		pp.fly();
		pp.landing();
		
		
//		CommercialPlane c=new CommercialPlane();
//		c.fly();
//		c.landing();

	}

}
