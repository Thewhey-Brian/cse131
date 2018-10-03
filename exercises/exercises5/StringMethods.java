package exercises5;

import sun.security.util.Length;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	
	public static String selfConcat(String s) {
		//return s + s;
		return copies(s, 2);
	}
	
	public static String copies(String s, int n) {
		//String s0 = "";
		//for (int i=0; i<n; i++) {
		//	s0 = s0 + s;
		//}
		//return s0;
		String[] array = new String[n];
		for (int i=0; i<n; i++) {
			array[i] = s;
		}
		return join(array, "");
		
	}
	
	public static String join(String[] array, String joiner) {
		String result = array[0];
		for (int i=1; i<array.length; ++i) {
			result = result + joiner + array[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		System.out.println(copies("Hello", 6));
		System.out.println(copies("echo", 2));
		String s = copies("wow!", 8);
		String t = "I love you!";
		System.out.println(s);
		String[] w = s.split("!");
		String[] k = t.split(" ");
		System.out.println(join(w, "@_@"));
		System.out.println(join(k, "!!! "));
	}

}
