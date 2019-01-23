
public class Lpalindrome {
	    public static String longestPalindrome(String s, char c, char d) {
	        // find all the substrings
	       
	        String max = "";
	        for(int i =0; i< s.length()-1; i++){
	            for(int j =0; j< s.length(); j++){
	                String sub = s.substring(i,i+j); 
	                boolean flag = recursivePalindrome(sub,0,sub.length()-1);
	                if(flag == true){
	                    if(max.length() < sub.length()){
	                        max = sub;
	                    }
	                }
	                
	                
	                 
	            }
	       
	        
	      
	    }
	        return max;
	}
	     static boolean recursivePalindrome(String text, int forward, int backward){
	                      if (forward == backward) {
	                           return true;
	                      }
	                      if ((text.charAt(forward)) != (text.charAt(backward))) {
	                           return false;
	                      }
	                      if (forward < backward + 1) {
	                            return recursivePalindrome(text, forward + 1, backward - 1);
	                      }
	                return true;
	                }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abababab";
		System.out.println(longestPalindrome(s,s.charAt(1),s.charAt(s.length()-1)));
		
	}

}
