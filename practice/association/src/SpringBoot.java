package practice.association.src;

public class SpringBoot implements ICourse 
{

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("SpringBoot Course purchased and the price paid is "+ amount);
		return true;
	}

}

