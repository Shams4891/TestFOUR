package collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	
	
	
	public static void main(String[] args) {
		
		
		PriorityQueue  q = new PriorityQueue () ;
		
		
		  q.add("A"); q.add("B"); q.add("C"); q.offer("C");
		 
			
			 System.out.println(q.peek());
			 System.out.println(q.remove());
		  
		  
				/*
				 * Iterator it = q.iterator(); while(it.hasNext()) {
				 * 
				 * System.out.println(it.next()); }
				 */
		  
		
	}

}
