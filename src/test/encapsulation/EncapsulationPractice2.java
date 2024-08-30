package encapsulation;

class Laptop
{
    private String brand;
    private float processor;

    public void setBrand(String brand) {
        this.brand = brand;
    }    
    public void setProcessor(float processor) {
        this.processor = processor;
    }

    public float getProcessor() {
        return processor;
    }
    public String getBrand() {
        return brand;
    }
    
}

public class EncapsulationPractice2 {
    public static void main(String[] args) {
        
        Laptop laptop = new Laptop();
        laptop.setBrand("Apple");
        laptop.setProcessor(2.4f);

        System.out.println(laptop.getBrand());
        System.out.println(laptop.getClass());
        System.out.println(laptop.getProcessor());

    }
    
}
