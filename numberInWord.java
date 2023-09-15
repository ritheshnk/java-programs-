public class numberInWord {


    public static void main(String[] args){
        printNumber(5);
    }
    public static void printNumber(int number){
        switch(number){
            case 1->System.out.println("ONE");
            case 2->System.out.println("Two");
            case 3->System.out.println("three");
            case 4->System.out.println("four");
            case 5->System.out.println("five");
            case 6->System.out.println("six");
            case 7->System.out.println("seven");
            case 8->System.out.println("eight");
            case 9->System.out.println("nine");
            default -> System.out.println("Invalid");


        }
    }
}
