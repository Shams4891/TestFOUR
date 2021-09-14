package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	
	
	 public static void main(String[] args) {
		
		 
		 ArrayList  al = new ArrayList ()  ;
		 

		 al.add("A");
		 al.add("B");
		 al.add("E");
		 al.add("D");
		 al.add("C");
		 al.add("F");
		 
		ArrayList  al_dup = new ArrayList();
		
		al_dup.addAll(al);
		System.out.println(al );
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		
		System.out.println(al);
		Collections.shuffle(al);
		
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
