package practice.AmazonAssociationProject.main;

import practice.AmazonAssociationProject.services.IDeliveryService;
import practice.AmazonAssociationProject.services.FedEx; // Assuming FedEx is the implementation of IDeliveryService

public class Amazon 
{
	private IDeliveryService service;
	
	public Amazon(IDeliveryService service)
	{
		this.service = service;
	}
	
	public void setService(IDeliveryService service)//IDeliveryService service =new FedEx();
	{
		this.service = service;
	}
	
	public Amazon()
	{
		
	}

	public Boolean deliverTheProduct(Double amount)
	{
		
		return service.deliverProduct(amount);
		
		
//		Boolean status=fed.deliverProduct(amount);
//		
//		return status;
	}

}

