
//HAS A RELATIONSHIP
class A{
   public int i;
    void m1(){
        System.out.println(" class A");
    }
}

class B{
    A a=new A();
    void m2(){
        System.out.println(" class B");
    }
}



public class HasARealtionShip {
    public static void main(String[] args) {
        B b=new B();

        b.a.m1();  //this  is has a relationship accessing class A with help of class B
        b.m2();

        b.a.i=10;
        System.out.println(b.a.i);//accessing the object through another class 
    }
}
