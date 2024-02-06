package p1;

public class Synchronization {
	int count=0;
	public  synchronized void increment() {
		for(int i=0;i<100;i++)
		{
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronization sc=new Synchronization();
		
		Thread t1=new Thread(()->sc.increment());
		Thread t2=new Thread(()->sc.increment());
		
		t1.start();
		t2.start();
		
		
		//wait for both thread to finish
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("final counter "+sc.getCount());
		}
	}

}
