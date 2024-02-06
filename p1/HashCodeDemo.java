package p1;

import java.util.HashMap;

public class HashCodeDemo {
	public static void main(String[] args) {
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("toyota", "supra");
		h.put("BMW", "m3");
		h.put("Audi","r8");
		h.put("nissan", "gtr");
		h.put("lamborgini", "urus");
		
		for(String i:h.keySet()) {
			System.out.println(i);
		}
		
		for(String i:h.values()) {
			System.out.println(i);
		}
		
		System.out.println(h.hashCode());
		
	}

}
