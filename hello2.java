package sample;

public class hello2 {
	
	public void nostatic(){
		System.out.println("this is my");
	}
	public static void staticinclude() {
		System.out.println("Java Program");
	}
	
	
	public static void main(String[] args) {
	hello2 helloObject= new hello2();
	System.out.println("Hello");
	helloObject.nostatic();
	staticinclude();
	}

}
