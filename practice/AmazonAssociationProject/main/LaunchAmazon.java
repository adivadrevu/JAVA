package practice.AmazonAssociationProject;


import practice.AmazonAssociationProject.services.BlueDart;
import practice.AmazonAssociationProject.services.FirstFlight;
import practice.AmazonAssociationProject.services.IDeliveryService;

public class LaunchAmazon 
{

	public static void main(String[] args) 
	{
		//Constructor Injection
		Amazon amz=new Amazon(new FirstFlight());
		
		//Bean
//		int age=10;
//		age=30;
//		
		
		//Injecting dependent object/depedency into target class is called as dependecy injection
		// If this is done through setter we call as setter injection
		// if this is done through constructor its called as constructor injection
		
		//target class/object ==> a class where services of other classes are being used 
		//eg in this project ==> Amazon class
		
		//dependent object/class ==> a class whose services will be used in target class
		//eg in this project ==> FirstFlight, FedEx, BlueDart
		
//		FedEx fedEx=new FedEx();
//		amz.setService(fedEx);
		
		//Setter Injection
//		amz.setService(new FedEx());
		amz.setService(new BlueDart());
		
		
		Boolean status=amz.deliverTheProduct(4545.4);
		if(status)
			System.out.println("Product Delivery Sucessfull");
		else
			System.out.println("Failed to Deliver Product");

	}

}
