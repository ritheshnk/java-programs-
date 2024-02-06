package p1;

class ParentSuper {
    int num1;
    int num2;

    ParentSuper(int x, int y) {
        num1 = x;
        num2 = y;
    }
}

class ChildSuper extends ParentSuper {
    int num;

    ChildSuper(int x, int y, int z) {
        super(x, y);
        num = z;
    }
    
    void display() {
    	int res=num+num1+num2;
    	System.out.println("the sum is "+res);
    }
}


public class Supper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildSuper c=new ChildSuper(4,5,6);
		
		c.display();

	}

}
