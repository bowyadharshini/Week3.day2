package week3.day2;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class printDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	    List<Integer>duplicate=new LinkedList<Integer>();
	    for (Integer array :arr) {
	    	  duplicate.add(array);
			for(int i=1;i<duplicate.size();i++) {
				
			}
		}
	    Collections.sort(duplicate);
	   // System.out.println(duplicate);
		for(int i=1;i<duplicate.size();i++) {
			
		if(duplicate.get(i-1)==duplicate.get(i))   
			System.out.println(duplicate.get(i));
		}

	}   
	     
	            
}
