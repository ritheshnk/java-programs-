class Dog{
    String sound="bow";

   public  Dog(String sound)
    {
        this.sound=sound;
    }

    void display(){
        System.out.println("This is a dog and it says "+sound);
    }
}

class puppy extends Dog{
    String breed="lab";

   
    public puppy(String sound,String breed){
        super(sound);
       //this.sound=sound;
        this.breed=breed;
    }

    void display(){
        System.out.println("This is a puppy of the breed "+breed+" sound is "+sound);
    }

}


public class super_class {

 public static void main(String[] args) {
    Dog d=new Dog("bow");
    puppy p = new puppy("golden", "woff");

    p.display();
 }
    
}
