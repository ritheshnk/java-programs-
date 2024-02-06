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
		
		/*This is used when a separate copy of the 
		  data is required for different purpose or usage.*/
				Reactangle r3=new Reactangle();
				r3.len=r1.len;
				r3.breadth=r1.breadth;
				System.out.println("deep copy");
				System.out.println(r3.len);
				System.out.println(r3.breadth);
		
		//reference to reactangle 
		//shallow copy
				
		/*This basically creates a new instance of the object and copies
		   all the data from the 
		   original data set to the newly created instance*/		
				
		System.out.println("shallow copy");
		
		System.out.println("before changig the values ");
		
		Reactangle r2=r1;
		System.out.println(r2.breadth);
		System.out.println(r2.len);
		
		r1.len=20;
		r1.breadth=45;
		//in shallow copy variable will change if we do any changes 
		//r2.len=99;
		//r2.breadth=78;
		System.out.println("after changig the values ");
		System.out.println(r2.breadth);
		System.out.println(r2.len);
		
		//deep copy wont change
		System.out.println("deep copy");
		System.out.println(r3.len);
		System.out.println(r3.breadth);
		
		//deep copy shortcut 
		//Rectangle r4=r1.clone();
		System.out.println("after changes original rectangel ");
		System.out.println(r1.len);
		System.out.println(r1.breadth);
		
	}

}
