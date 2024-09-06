package practice.inheritance;

class Plane
{
	
}

class FighterPlane extends Plane
{
	
}

class Animal
{
    public void eat(String foodType)
    {
        System.out.println("Animals are required to eat");
    }

    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    public Plane runnig()
    {
        System.out.println("Amimal is running");
        Plane p = new Plane();
        return p;
    }
}

class Tiger extends Animal 
{
    public void eat(String foodType)
	{
		System.out.println("Tiger hunts and eat");
	}
	
	public void eat()//its overloaded method of Child class and hence its specialzed method of child class
	{
		System.out.println("Tiger hunts and eat");

	}
    public FighterPlane running()//co-varient return type are such return where there is is-A relationship
	{
		System.out.println("Tiger is running to hunt");
		FighterPlane fp=new FighterPlane();
		return fp;
	}
}

public class PracticeInheritance2 {
    public static void main(String[] args) {
        
        Tiger t=new Tiger();
		t.eat();
    }

}
