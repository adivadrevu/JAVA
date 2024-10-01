package practice.annotations;

enum Week
{
	MON, TUE, WED, THU, FRI, SAT, SUN;
	//Mon, Tue, wed, thu, frI;

}
public class PracticeEnnum5 
{
	enum Direction
	{
		NORTH, EAST, SOUTH, WEST;
	}
	
	public static void main(String[] args) 
	{
		
		Week w=Week.MON;
		
		System.out.println(w);
	    
		int index=Week.SAT.ordinal();
		System.out.println(index);
		
		Week war[]=Week.values();
		
		for(Week elem:war)
		{
			System.out.print(elem.ordinal() + " : " + elem + " , ");
		}
	}

}
