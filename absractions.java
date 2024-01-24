abstract class Automobile {
    void sound() {
        System.out.println("automobile sound");
    }

    abstract void model();
}

class Car extends Automobile {
    void speed() {
        System.out.println("car is moving at high speed");
    }

    void model() {
        System.out.println("Car Model: Audi R8");
    }
}

public class absractions {
    public static void main(String[] args) {
        Car c = new Car();
        c.sound();
        c.model();
        c.speed();
        /* 
         Automobile a=new Automobile();
        a.sound();

        cannot be initialized
        */
        

    }
}
