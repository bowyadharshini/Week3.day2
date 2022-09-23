package week3.day2;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,6,8,7};
		List<Integer>simple=new  ArrayList<Integer>();
	      for (Integer integer : array) {
			 simple.add(integer);
		}
	      Collections.sort( simple);
	      System.out.println(simple);
	      for(int x=1;x<simple.size();x++)
	      {
	    	 if((x)!=simple.get(x-1)){
	    		 System.out.println(x);
	    	 }
	      }
	      
	}

}
