package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(9);
		l.add(7);
		l.add(4);
		
		Iterator i=l.listIterator();
		
		while(i.hasNext())
		{
			System.out.print(" "+i.next());
		}
		
		
		Collections.sort(l);
		
		//System.out.print(l);
		System.out.println();
		Iterator j=l.listIterator();
		while(j.hasNext())
		{
			System.out.print(" "+j.next());
		}
	}

}
