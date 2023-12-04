import java.util.Scanner;

class Main {

  public static int checkage(int dob,int current){
     if((dob<=1950)||(dob>=2023))
     {
       return -1;
     }else{
       return (current-dob);
     }
      
  };
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter your name ");
    String name=sc.nextLine();

    boolean isValid=false;
    int age=0;
    do{
       System.out.println("enter your DOB");
    int dob=sc.nextInt();

    System.out.println("enter your current Year");
    int current=sc.nextInt();

     age=checkage(dob, current);

      isValid=(age<0)?false:true;
      
    }while(!isValid);
   
    System.out.println("Your age is "+ age);
     
    
  }
}
