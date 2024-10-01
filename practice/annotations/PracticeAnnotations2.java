package practice.annotations;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,
	ElementType.LOCAL_VARIABLE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@interface CricketPlayer
{
	String country() default "India";
	int age() default 34;
	
}//@ this specifies compiler that annotation type is being created

//virat kohli is a cricket player who lived in india and play for india this class if for him 
//@CricketPlayer(country = "India", age =35)
@CricketPlayer(country="UK")
class ViratKohli
{
	
	@CricketPlayer
	private int innings;
	@CricketPlayer
	public ViratKohli()
	{
		
	}
	
	@CricketPlayer
	public int getInnings() {
		return innings;
	}

	
	public void setInnings(@CricketPlayer int innings) {
		this.innings = innings;
	}
	
	
}


public class PracticeAnnotations2 
{

	public static void main(String[] args) 
	{
		ViratKohli vk=new ViratKohli();
		vk.setInnings(344);
		System.out.println(vk.getInnings());
		
		System.out.println("*****************************");
		
		Class<? extends ViratKohli> c = vk.getClass();
		Annotation an = c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer)an;
		int age=cp.age();
		String co=cp.country();
		System.out.println("Info of attrib of  annotaiotns "+age+ " "+ co);

	}

}
