package collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList(); // heterogeneous
//	 linkedList <String> list = new LinkedList <String > ()	;  
		// for homogenous String
		
		
		
		list.add(600);
		list.add("JAVA");
		list.add("PYTHON");
		list.add(12.66);
		list.add(true);
		list.add(false);
		list.add("DELL");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(12.66));
		System.out.println(list);
		System.out.println(list.remove(0));
		
		System.out.println(list);
		list.add(1, "AAA");
		System.out.println(list);
		System.out.println(list.get(3));
		
		System.out.println(list.set(0,"JSCRIPT"));
		
		System.out.println(list);
		System.out.println(list.contains("PYTHON"));
		System.out.println(list.contains("SAMSUNG"));
		
		System.out.println(list.isEmpty());
		
		for(int i =0 ; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		/*
		 * for( Object l : list) {
		 * 
		 * System.out.println(list.get(i)); }
		 */
		
//		 Iterable it = list.iterator);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
