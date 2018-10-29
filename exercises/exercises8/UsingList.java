package exercises8;

import java.util.LinkedList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//
		
		List<String> String = new LinkedList<String>();
		String.add("open mouth");
		String.add("insert food");
		String.add("chew");
		String.add("chew");
		String.add("swallow");
		//String.add( "Yes! I am right!");
		String.remove("chew");
		String.remove(1);
		
		System.out.println(String);

	}

}
