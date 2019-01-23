import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_allwords {
	public static List<Integer> findSubstring(String s, String[] words){
        Map<String,Integer> counts = new HashMap<>();
        for(String word : words){
        	counts.put(word,counts.getOrDefault(word,0)+1);
        }
        List<Integer> indexs = new ArrayList<>();
		int n = s.length();
		int num = words.length;
		int len = words[0].length();
		// i is less then n - length of all words cause no need to traverse through the end 
		for(int i = 0 ; i<n-num*len +1; i++) {
			Map<String, Integer> seen = new HashMap<>();
			int j = 0 ;
			while(j<num) {
				String word = s.substring(i+j*len,i+(j+1)*len);
				if(counts.containsKey(word)) {
					seen.put(word, seen.getOrDefault(word, 0)+1);
					if(seen.get(word)>counts.getOrDefault(word, 0)) {
						break;
					}
				}else {
					break;
				}
				j++;
				}
			if(j==num) {
				indexs.add(i);
			}
			}
		return indexs;
		}
    
	
	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String[] words = new String[2];
		words[0]= "bar";
		words[1] = "foo";
		System.out.println(findSubstring(s, words));
	}
}
