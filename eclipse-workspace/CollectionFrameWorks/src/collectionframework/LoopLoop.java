package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class LoopLoop {
	
	
	 public static void main(String[] args) {
		
		 
		   HashSet s = new HashSet ();
		   
		   s.add(5);
		   s.add(10);
		   s.add(15);
		   s.add(20);
		   s.add(25);
		   
		   Iterator it = s.iterator();
		   while(it.hasNext())
				   {
			   
			   
			   System.out.println(it.next());
		   }
		   
		   
	}

}
