package week3.day2;

import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray= {3,2,11,4,6,7};
		int[] secondArray={1,2,8,4,9,7};
		List<Integer>List1=new LinkedList<Integer>();
		for (Integer item1 :firstArray ) {
        	 List1.add(item1);
		}
        
        List<Integer>List2=new LinkedList<Integer>();
         for (Integer item2 :secondArray ) {
        	 List2.add(item2);
           
		}
           List1.retainAll(List2);
           System.out.println("Intersection:"+List1);
	    }

}
