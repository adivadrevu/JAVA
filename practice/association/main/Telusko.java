package practice.association.main;

public class Telusko {

	private ICourse course;

	
	public Telusko(ICourse course) 
	{
		super();
		this.course = course;
	}
	
	public Telusko() 
	{
		super();
	}

	public void setCourse(ICourse course) 
	{
		this.course = course;
	}
	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
	

}
