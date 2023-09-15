public class Switch {
    public static void main(String[] args)
    {
        int val=3;

        switch (val){
            case 1:
                    System.out.println("The value is 1");
                    break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            default:
                System.out.println("No position is available");
        }

        int num=3;
//
//        switch (num)
//        {
//            case 1:
//                System.out.println("the value is 1");
//                break;
//            case 2:
//                    System.out.println("the value is 2");
//                    break;
//            case 3: case 4: case 5:
//                System.out.println("the value was not 1 or 2");
//                System.out.println("It was "+num);
//
//                break;
//            default:
//                System.out.println("the value invalid");
//        }

        switch (num) {
            case 1 -> System.out.println("the value is 1");
            case 2 -> System.out.println("the value is 2");
            case 3, 4, 5 -> {
                System.out.println("the value was not 1 or 2");
                System.out.println("It was " + num);
            }
            default -> System.out.println("the value invalid");
        }
    }


}
