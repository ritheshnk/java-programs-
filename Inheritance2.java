 class Gadi{
    protected String brand="bmw";
    protected int speed=250;
    
    void display(){
        System.out.println("Brand : "+brand+" has speed"+speed);
    }
}

public class Inheritance2 extends Gadi {
    public static void main(String[] args) {
        Inheritance2 car=new Inheritance2();

    car.display();
    }
}
