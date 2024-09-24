package practice.collections;

import java.util.LinkedList;

public class PracticeLinkedList 

{

	public static void main(String[] args) 
	{
		LinkedList ll1=new LinkedList();
		ll1.add(10);
		ll1.add("Java");
		ll1.add("Bengaluru");
		ll1.add(20);
		System.out.println("*****************");
		System.out.println(ll1);

		ll1.addFirst(44);
		ll1.addLast(54);
		ll1.add(2, "Telusko");
		System.out.println("*****************");
		System.out.println(ll1);
		
		ll1.offer("DevOps");
		System.out.println(ll1);
		ll1.offer("Junit5");
		System.out.println(ll1);
		System.out.println("*****************");
		ll1.offerFirst("SpringBoot");
		
		System.out.println(ll1);
		System.out.println(ll1);
		System.out.println(ll1.peek() + " peek method"); // SpringBoot
		
		System.out.println(ll1); // SpringBoot, 44, Java, Bengaluru, Telusko, 20, DevOps, Junit5, 54
		
		System.out.println(ll1.poll()); // SpringBoot
		
		System.out.println(ll1); // 44, Java, Bengaluru, Telusko, 20, DevOps, Junit5, 54
		ll1.add("Telusko"); // 44, Java, Bengaluru, Telusko, 20, DevOps, Junit5, 54, Telusko
		System.out.println(ll1); // 44, Java, Bengaluru, Telusko, 20, DevOps, Junit5, 54, Telusko
		
		ll1.push(200); 
		System.out.println(ll1); // 200, 44, Java, Bengaluru, Telusko, 20, DevOps, Junit5, 54, Telusko

		System.out.println(ll1.pop()); // 200
		System.out.println(ll1); // Java, Bengaluru, Telusko, 20, DevOps, Junit5, 54, Telusko

	}

}
