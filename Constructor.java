
class  Demo{

    int n;
    String name;
    //constructor overloading
    public Demo(){
        System.out.println("construtor is called ");
    }

    public Demo(int n){
        this.n=n;
        System.out.println("int constor called ");
    }

    public Demo(String name)
    {
        this.name=name;
        System.out.println("name para is called");
    }

}



public class Constructor {

    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo(5);
        Demo d3=new Demo("rithu");
    }
    
}
