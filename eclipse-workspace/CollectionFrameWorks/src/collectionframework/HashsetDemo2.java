package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo2 {

	public static void main(String[] args) {

		
		
		HashSet <Integer> evenNumber = new HashSet <Integer>();
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("HashSet EVENNUMBER" + evenNumber);
		
		HashSet <Integer> numbers = new HashSet <Integer>();
		
		numbers.addAll(evenNumber);
		numbers.add(10);
		System.out.println(("New HashSet NUMBERS  " + numbers));
		numbers.removeAll(evenNumber);
		System.out.println(numbers);
		
	}

}
