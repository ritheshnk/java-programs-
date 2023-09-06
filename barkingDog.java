public class barkingDog {

    public static void main(String[] args){
        System.out.println("I am awake "+ shouldWakeUp(true,55));
        System.out.println("I am awake "+ shouldWakeUp(true,7));
        System.out.println("I am awake "+ shouldWakeUp(true,9));
        System.out.println("I am awake "+ shouldWakeUp(true,23));
    }
    public static boolean shouldWakeUp(boolean barking,int hourofDay){


        if(hourofDay>=0 && hourofDay<=23)
        {
            if(hourofDay<=8 || hourofDay>=22){
                barking=true;
            }else {
                barking=false;
            }
        }else {
            barking=false;
        }

        return barking;
    }
}
