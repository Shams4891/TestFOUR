package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {	
	 public static void main(String[] args) {
		
		 LinkedList list = new LinkedList ();
		 
		 list.add(1000);
		 list.add("H P");
		 list.add("DELL");
		 list.add("PIZZA");
		 list.add(24);		
		 for(int i =0 ; i< list.size(); i++) {
			 
			 System.out.println(list.get(i));
		 }
		 System.out.println("----------------");
		 
		for(Object ob : list) { 
			System.out.println(ob);			
		}		
		System.out.println("----------------");	
		Iterator it =  list.iterator();
		while(it.hasNext()) {			
			System.out.println(it.next());
		};
			}
}
