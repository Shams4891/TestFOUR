package collectionframework;

import java.util.HashMap;

public class HashMapDemo1 {
	
	 public static void main(String[] args) {
		
		 
		 
		 HashMap<Integer,String> m  = new HashMap <Integer,String> ();
		 m.put(101, "JOHN");
		 m.put(102, "DAvid");
		 m.put(103, "Scot");
		 m.put(104, "Marry");
    	 m.put(105, "Tye");
		 m.put(106, "X");
		 m.put(107, "DAVID");
		 
		 
		 System.out.println(m);
		 m.remove(101);
		 System.out.println(m);
		System.out.println( m.containsKey(101));
		System.out.println(m.containsKey(102));
		 
		 
		 
		
		 
		 
	}

}
