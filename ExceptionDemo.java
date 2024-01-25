class Demo{
    void cal(){
        try {
            int a=5;
            System.out.println(a/0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("not possible ");
            throw e;
        }
    }
}


public class ExceptionDemo {
    public static void main(String[] args) {
        Demo d=new Demo();

        try {
            d.cal();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();  //if comment this it wont print error.
                //or
            System.out.println(e);
        }
    }
    
}
