package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Declaring ArrayList

		/*
		 * ArrayList al = new ArrayList(); ArrayList <Integer> al1 = new ArrayList
		 * <Integer>();
		 * 
		 * ArrayList<String> al2 = new ArrayList<String>(); List a1=new ArrayList();
		 */

		ArrayList a1 = new ArrayList(); // heterogeneous Arraylist
		a1.add(1000); // adding
		a1.add("JAVA");
		a1.add('A');
		a1.add(12.6);
		a1.add("HP");
		System.out.println(a1);

		int num = a1.size();
		System.out.println(a1.size());
		System.out.println(num);
		System.out.println("Size of the Array List" + " " + a1.size());

		a1.remove(1);
		System.out.println(a1);
		a1.add(1, "JAVA");

		System.out.println(a1);

		a1.add(199);
		System.out.println(a1);
		a1.add(3, "PYTHON");
		System.out.println(a1);

		a1.get(4);
		System.out.println(a1.get(4));

		a1.set(2, 909);
		System.out.println(a1);
		System.out.println(a1.contains(199)); // True
		System.out.println(a1.contains("C"));// false
     System.out.println(a1.isEmpty());
     
     for(int i=0 ; i<a1.size(); i++) {
    	 
    	 
    	 System.out.println(a1.get(i));
     }
     
      for( Object  a2 : a1) {
    	System.out.println(a2);  
    	  
      }
       
      Iterator<String> it = a1.iterator();
      System.out.println(it.next());


     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}
}
