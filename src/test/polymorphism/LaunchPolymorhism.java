package test.polymorphism;

class AeroPlane
{
    public void takingOff(){
		System.out.println("Aeroplane must takeOff in order to fly");
	}
	
	public void fly(){
		System.out.println("AeroPlane is flying");
	}
	
	public void landing(){
		System.out.println("Aeroplane is landing");
	}

}

class CargoPlane extends AeroPlane 
{
    public void takingOff(){
		System.out.println("CargoPlane requires longer runway to takeOFF");
	}
	public void fly(){
		System.out.println("cargoPlane is flying");
	}
	public void landing(){
		System.out.println("cargoplane is landing");
	}
}

class FighterPlane extends AeroPlane{
    
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




public class LaunchPolymorhism {
    public static void main(String[] args) {

        AeroPlane cp=new CargoPlane();
		cp.takingOff();
		cp.landing();
	//	((CargoPlane) cp).fly();
		
		System.out.println("*******************************");
		
		AeroPlane fp=new FighterPlane();
		fp.takingOff();
		fp.landing();
	//	((FighterPlane) fp).fly();
	

        
    }

}
