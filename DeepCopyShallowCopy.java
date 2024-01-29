package p1;


class Reactangle{
	int len=10;
	int breadth=5;
}
public class DeepCopyShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reactangle r1=new Reactangle();
		System.out.println("object created ");
		System.out.println(r1.len);
		System.out.println(r1.breadth);
			
		//deep copy
				Reactangle r3=new Reactangle();
				r3.len=r1.len;
				r3.breadth=r1.breadth;
				System.out.println("deep copy");
				System.out.println(r3.len);
				System.out.println(r3.breadth);
		
		//reference to reactangle 
		//shallow copy
		System.out.println("shallow copy");
		
		System.out.println("before changig the values ");
		
		Reactangle r2=r1;
		System.out.println(r2.breadth);
		System.out.println(r2.len);
		
		r1.len=20;
		r1.breadth=45;
		//in shallow copy variable will change if we do any changes 
		
		System.out.println("after changig the values ");
		System.out.println(r2.breadth);
		System.out.println(r2.len);
		
		//deep copy wont change
		System.out.println("deep copy");
		System.out.println(r3.len);
		System.out.println(r3.breadth);
		
		//deep copy shortcut 
		//Reactangle r4=r1.clone();
		
		
	}

}
