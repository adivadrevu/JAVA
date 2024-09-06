package practice.encapsulation;

class StudentDetails
{
    private int id;
    private String name;
    private int marks;
    
    public String getName() {
        return name;
    }    
    public void setId(int id) {
        this.id = id;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

class EncapsulationPractice1 {
    public static void main(String[] args) {
        
        StudentDetails sd = new StudentDetails();
        sd.setId(9);
        sd.setName("Aditya");
        sd.setMarks(100);

        System.out.println(sd.getId());
        System.out.println(sd.getName());
        System.out.println(sd.getMarks());
    }
    
}