package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
import com.sun.source.tree.WhileLoopTree;
public class Iterator1 {	
	 public static void main(String[] args) {		
		   ArrayList<String> a = new ArrayList<String>() ;
		 
		   a.add("100");
		   a.add("HP");
		   a.add("88");
		   a.add("JaVa");
		   a.add("Car");
		   a.add("9898");		   
		  for (String  s : a) {
			  
			  System.out.println(s);
		  }		  
		  System.out.println("--------------------------------------");	  
		  ArrayList<Integer> ai = new ArrayList<Integer>();		  
		   ai.add(5);
		   ai.add(10);
		   ai.add(15);
		   ai.add(20);
		   ai.add(25);
		   ai.add(30);
		   
		   for (Integer al  : ai) {
			   
			   System.out.println(al);
		   }
		   
	}

}
