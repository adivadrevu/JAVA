package practice.inheritance;

class Plane{

    String name = "Southwest Airlines";
    String airport = "DFW";

    public Plane() {
        System.out.println("Constructor - Zero param of Plane class");
        
    }

    void display(){
        System.out.println("Display method - Plane class");
        System.out.println("The name of the flight is "+ name + "and the airport is "+airport);
    }
}
class Aeroplane extends Plane
{

    void display(){
        System.out.println("Overriden method - Aeroplane class");
        System.out.println("The name of the flight is "+ name + "and the airport is "+airport);
    }
}


public class PracticeInheritance {
    public static void main(String[] args) {
        
        new Plane().display();
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.display();
    }

}
