public class megaByteConvert {
    public static void main(String[] args){
        printMegaBytesAdKilobytes(2500);
    }
    public static void printMegaBytesAdKilobytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invlaid");
        }

        //1MB=1024kb
        int megaBytes=0;
        int rem=0;

        megaBytes=kiloBytes/1024;
        rem=kiloBytes % 1024;

        System.out.println(kiloBytes +"KB = "+ megaBytes+" MB " +rem+" KB");
    }


}
