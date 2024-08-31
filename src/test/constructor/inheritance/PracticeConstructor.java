package test.constructor.inheritance;

class Alpha{

    int x,y;

    Alpha(){
        this(1, 3);
        System.out.println("zero param constructor");
    }

    Alpha(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("Param constructor");
        System.out.println(x);
        System.out.println(y);
    }
}
class Beta extends Alpha{

    Beta(){

    }
    Beta(int a, int b){
        this.a = a;
        this.b = b;

    }
    
    void display()
    {
        System.out.println("Displpay Method in Beta Method");
    }

}

public class PracticeConstructor {
    public static void main(String[] args) {
        
        

    }

}
