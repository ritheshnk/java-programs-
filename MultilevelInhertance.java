//create 3 class having diffent mehtods and integrate in multilevel inheritance

class Sms{
    protected String sms="hey, how are you?";

    void sms(){
        System.out.println("Sending "+sms);
    }

}




class videoCall extends Sms{
    protected String call="calling..!";

    void call(){
        System.out.println("Making a Video Call to: ");
    }
}


class Mobile extends videoCall{
    protected int num=25565;

    void calling(){
        System.out.println("calling mobile number "+num);
    }
}

public class MultilevelInhertance extends Mobile {
    public static void main(String[] args){
        MultilevelInhertance ml=new MultilevelInhertance();
        ml.sms();
        ml.call();
        ml.calling();
    }
    
}
