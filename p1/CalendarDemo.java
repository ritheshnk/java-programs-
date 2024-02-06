package p1;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		int y=c.get(Calendar.YEAR);
		int m=c.get(Calendar.MONTH);
		int d=c.get(Calendar.DAY_OF_MONTH);
		System.out.println("Calendar date and time "+ c.getTime());
		
		c.add(c.DAY_OF_MONTH, 7);
		
		System.out.println(c.getTime());
		
		c.set(2023,c.MAY,15);
		
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		
//		System.out.println(y);
//		System.out.println(m);
//		System.out.println(d);

	}

}
