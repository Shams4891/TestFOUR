package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {
	
	 public static void main(String[] args) {
		
		 LinkedList  list = new LinkedList () ;
		 
		 list.add(1);
		 list.add(7);
		 list.add(13);
		 list.add(19);
		 list.add(25
				 
				 
				 
				 
				 );
		 
		 LinkedList  list1 = new LinkedList ();
		 list1.addAll(list);
		 System.out.println(list1);
		 list1.removeAll(list1);
		 System.out.println(list1);
		 
	 
		 System.out.println(list);
		 Collections.sort(list);
		 Collections.sort(list , Collections.reverseOrder());
		 
		 System.out.println(list);
		 
		 
		 Collections.shuffle(list);
		 System.out.println(list);
		 
		 
		 list.addFirst(555);
		 System.out.println(list);
		 
		 
		 
		 
		 
		 
		 
		 list.addLast(878787);
		 
		 System.out.println(list);
		 System.out.println(list.getFirst());
		 System.out.println(list.getLast());
		 
		 
		 
		 
	}

}
