package exercises8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//    (most of what you want can be 
		//      copied and pasted from 
		//      your solution to UsingList)
		//
		
		Set<String> eating = new HashSet<String>();
		eating.add("open mouth");
		eating.add("insert food");
		eating.add("chew");
		//eating.add("chew");
		eating.add("swallow");
		eating.add( "Yes! I am right!");
		//eating.remove("chew");
		//eating.remove(1);
		
		System.out.println(eating);
		

	}

}
