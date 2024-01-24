class Animal{
    
        void walk(){
            System.out.println("animal is walking");
        }
}

class Lion extends Animal{
    
        void eat(){
            System.out.println("lion is eating meat");
        }

}

class Cab extends Lion{
    
        void play(){
            System.out.println("cab is playing with its tail");
        }
}

class Cow extends Animal{
    
    void eat(){
        System.out.println("cow is eating grass");
    }
}

class Calf extends Cow{
    
    void play(){
        System.out.println("calf is playing with its mother's horn");
    }
}

public class hierarchicalInheritance extends Animal {
    public static void main(String[] args) {
        Cab l=new Cab();
        Calf c=new Calf();

        c.eat();
        l.eat();
        c.play();
        l.play();
    }
    
}
