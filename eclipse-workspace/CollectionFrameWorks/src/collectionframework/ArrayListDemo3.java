package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		String str[] = { "AAA", "BBB", "CCC", "DDD" };
		
		for(String str1 : str) {
			
			System.out.println(str1);
		}
		
		
		ArrayList  al = new ArrayList (Arrays.asList(str)) ;
		
		System.out.println(al);
		
	}

}
