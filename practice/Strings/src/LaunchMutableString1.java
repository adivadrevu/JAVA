
public class LaunchMutableString1 {

	public static void main(String[] args) 
	{
		//StringBuffer s="Telusko";CE
//		StringBuffer sb1=new StringBuffer("Telusko");
		StringBuilder sb1=new StringBuilder("Telusko");
		System.out.println(sb1);
		sb1.append(" Alien");
		System.out.println(sb1);
		sb1.append(45.4);
		sb1.append(true);
		System.out.println(sb1);

	}

}
