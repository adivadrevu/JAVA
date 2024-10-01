package practice.annotations;
class Animal
{
	public void animalUsuallyHuntsAndEat()
	{
		System.out.println("Animal is eating.....");
	}
}
//@Override
class Tiger extends Animal
{
	//overridding parent class method to suite child requirement
	@Override
	public void animalUsuallyHuntsAndEat()
	{
		System.out.println("Tiger hunts and eat......");
	}
}
public class PracticeAnnotations3

{

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.animalUsuallyHuntsAndEat();

	}

}
