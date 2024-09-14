package practice.association.src.main;

import practice.association.src.Java;
import practice.association.src.SpringBoot;

public class LaunchApp {
	public static void main(String[] args) 
	{
		Telusko telusko=new Telusko(new Java());
		
		telusko.setCourse(new SpringBoot());
		
		
		Boolean status=telusko.buyTheCourse(2500.0);
		if(status)
			System.out.println("Course Purchased Successfully");
		else
			System.out.println("Failed to buy the course");

	}

}
