package collectionframework;

import java.util.HashSet;

public class HashSetDemo3 {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer>  set1 = new HashSet<Integer> ();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		
		System.out.println("HashSet :set1 " +set1);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		System.out.println("HashSet  : set2 " +set2);
		
		set1.addAll(set1);
		System.out.println(set1);
		set1.removeAll(set2);
		System.out.println(set1);
		set1.containsAll(set2);
		System.out.println(set1);
	}
	
	
	
	
	
	
	

}
