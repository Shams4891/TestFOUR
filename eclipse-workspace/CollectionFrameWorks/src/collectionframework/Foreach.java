package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Foreach {
	
	public static void main(String[] args) {
		
		  ArrayList   al = new ArrayList();
		  al.add(1000);
		  al.add("JAVA");
		  al.add("CAR");
		  al.add(2.55);
		  al.add("LAPTOP");
		  
		  
		  for( Object a : al) { 
				/* here ArrayList is a collection
				 *  thats is group of object
				 *  in one unit */
			  
			  
			  System.out.println(a);
		  }
		  
		  ArrayList <String>  a1 = new ArrayList <String>();
		 
		  a1.add("FORD");
		  a1.add("PYTHON");
		  a1.add("007");
		   
		  for ( String s : a1) {
			  
			  System.out.println(s);
		  }
		  
		  ArrayList <Integer>  a2 = new ArrayList <Integer>();
			 
		  a2.add(3);
		  a2.add(5);
		  a2.add(55);
		  
		  for (int  in  : a2) {
			  
			  System.out.println(a2);
		  }
		  
		  Iterator  it1 =a2.iterator();
		  while(it1.hasNext()) {
			  
			  System.out.println(it1.next());
		  }
		   Iterator  it = al.iterator();
		   while(it.hasNext()) {
			   System.out.println(it.next());
		   }
		   
		   
		
	}

}
