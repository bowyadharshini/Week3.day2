package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.graphbuilder.struc.LinkedList;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
        String[] Word =text.split(" ");
        
        Set<String>display=new LinkedHashSet<String>();
        for (String ss :Word){
		  display.add(ss);
		} 
        System.out.println(display);
	}      
        
}

