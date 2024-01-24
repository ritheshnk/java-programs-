class instanceandStatic{
    int i=5;
    static int j=10;

    static void add(){
       // System.out.println(i+j); //not possib;e to use static variable with non static variabe in static method
       System.out.println("cannt perform operation");
    }

    void multiply(){
        System.out.println(i*j);
    }
}

public class instanceStatic {
    public static void main(String[] args) {

        instanceandStatic i=new instanceandStatic();
        i.add();
        i.multiply();
        
    }
    
}
