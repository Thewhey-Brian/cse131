package studio9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cse131.NotYetImplementedException;
import lab5.Strings;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2; 
	 * key="be", value=2; 
	 * key="or", value=1; 
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		Map<String, Integer> count = new HashMap<String, Integer>();
		
		
//		for(int i=0; i<words.size(); ++i) {
//			if(Strings.equals(tar, words.get(i))) {
//				num = num + 1;
//			}
//		}
		while(words.size()!=0){
			int num = 0;
			int s = 0;
			String tar = words.get(0);
			for(int i=0; i<words.size(); ++i) {
				if(Strings.equals(tar, words.get(i))) {
					num = num + 1;
				}
			}
			count.put(tar, num);
			while(s<=words.size()) {
				if(Strings.equals(tar, words.get(s))) {
					words.remove(s);
				}
				else {
					s++;
				}
			}
		}
		return count;


		
	}
}
