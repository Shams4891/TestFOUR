package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	  public static void main(String[] args) {
		
		   HashSet hs = new HashSet();
		  

		   hs.add(50);
		   hs.add(100);
		   hs.add("JAVA");
		   hs.add("PYTHON");
		   hs.add("DELL");
		   
		   System.out.println(hs);
		   hs.addAll(hs);
		   System.out.println(hs);
		   hs.add(null);
		   System.out.println(hs);
		   // duplicates is not allwed
		   hs.remove("JAVA");
		   hs.remove(null);
		   System.out.println(hs);
		  
		   System.out.println(hs);
		   hs.contains(100);
		   System.out.println(hs.contains(100));
		   
		   System.out.println(hs.isEmpty());
		   
		  
			/*
			 * for(Object a : hs) {
			 * 
			 * System.out.println(a); }
			 */
		   
		 Iterator it = hs.iterator(); 
		   
		  while(it.hasNext()) {
			  System.out.println(it.next()); 
			  
		  }
		   
		   
		hs.addAll(hs) ;
		System.out.println(hs);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		  
	}

}
