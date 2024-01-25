
//SINGLE LEVEL INTERFACE
interface Switch{
    void on();
    void off();
}

class Tv implements Switch{
    public void on(){
        System.out.println("the tv is on");
    }

    public void off(){
        System.out.println("tv is off");
    }
}

//MULTILEVEL INTERFACE 
interface vehicle{
    void park();
    void drive();
    void reverse();
}

interface key{
    void keyOn();
    void keyOff();
}

class bmwCar implements key,vehicle{
   public  void keyOn(){
        System.out.println("car key turned on");
    }

   public void keyOff(){
        System.out.println("car key turned off");
    }

    public void park(){
        System.out.println("car is being parked");
    }

    public void  drive(){
        System.out.println("car is driving");
    }

    public void reverse(){
        System.out.println("car is in reversing mode");
    }
}





public class Interface1 {
    public static void main(String[] args) {
        Tv t=new Tv();

        t.on();
        t.off();

        bmwCar car=new bmwCar();

        car.keyOn();
        car.drive();
        car.reverse();
        car.park();
        car.keyOff();
    }
}
