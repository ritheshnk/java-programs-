public class intrestIncrease {

    public static void main(String[] args){
        DisplayIntrest(100000,2);
    }
    public static void DisplayIntrest(double amount,double intrest){
        for(;intrest<=5;intrest++){
            System.out.println("the amount "+amount+" has intrest "+intrest + " has "+ calculateIntrest(amount,intrest));
        }
    }

    public static double calculateIntrest(double amount, double intrest){
        return (amount * (intrest/100));
    }
}
