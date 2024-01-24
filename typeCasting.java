public class typeCasting {
    public static void main(String[] args) {

        //Implicit type casting

        //from big primitive data type to small no need of type casting automatically it will do 
        
        //int->double 
        int i=5;
        double d=i;

        System.out.println("int value "+i);
        System.out.println("double value afer casting from int "+d);


        //explicit casting

        //from smaall primitive data type to big  need of type casting  

        double j=10;
        //int k=j; //error

        int k=(int)j;
        System.out.println(k);

       
    }
}
