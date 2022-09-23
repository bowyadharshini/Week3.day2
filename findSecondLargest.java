package week3.day2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class findSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data={3,2,11,4,6,7};
		List<Integer>SS=new LinkedList<Integer>();
           for (Integer item :data) {
        	  SS.add(item);
			
		}
           Collections.sort(SS);
        System.out.println(SS.size());
        System.out.println(SS.get(SS.size()-2));

	}
}
