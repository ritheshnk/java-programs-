class Mother{

    void life(){
        System.out.println("I am a mother");
    }
}

class Son extends Mother{
    void life(){
        System.out.println("modern life");
    }
}




public class method_overiding {
    public static void main(String[] args) {
        Mother m = new Son();
        m.life();

        Mother m1= new Mother();
        m1.life();

        Son s=new Son();
        s.life();

      /* 
        Son s1=new Mother();
        s1.life(); //method overiding
        
        */  
    
    }
    
}
