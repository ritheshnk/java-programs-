import java.util.Scanner;

public class calculator {

    public static class calculatorOperations{
        private int num1,num2;

        calculatorOperations(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
        }

        int  add()
        {
            return (num1+num2);
        }

        int sub()
        {
            return (num1-num2);
        }

        int multiply()
        {
            return (num1*num2);
        }

        int division(){
            if(num2==0){
                return -1;
            }else{
                return (num1/num2);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        calculatorOperations c=new calculatorOperations(n1,n2);
        System.out.println(c.add());
        
    }
}
