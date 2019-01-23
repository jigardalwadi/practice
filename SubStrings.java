
public class SubStrings {
		static boolean isPalRec(String str,int s, int e) {
		// If there is only one character 
		if (s == e) 
			return true; 

		// If first and last  
		// characters do not match 
		if ((str.charAt(s)) != (str.charAt(e))) 
			return false; 

		// If there are more than  
		// two characters, check if 
		// middle substring is also 
		// palindrome or not. 
		if (s < e + 1) 
			return isPalRec(str, s + 1, e - 1); 
		
		return true; 
		} 

		static boolean isPalindrome(String str) 
		{ 
			int n = str.length(); 
			// An empty string is  
			// considered as palindrome 
			if (n == 0) 
				return true; 
			
			return isPalRec(str, 0, n - 1); 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String string="abaaa", sub;
		 String longest = "";
	     int i, c, length;
	     int max = 0;
		length = string.length();
		
	     for (c = 0; c < length; c++)
	      {
	         for(i = 1; i <= length - c; i++)
	         {
	            sub = string.substring(c, c+i);
	            if (isPalindrome(sub)) {
	            	int l = sub.length();
	            	if(l > max) {
	            		max = l;
	            		longest = sub;
	            	}
	                System.out.println("The substring:" + sub + "is palindrom"); 
	            }
	            else
	                System.out.println("No"); 
	           
	         }
	      }
	     System.out.println(longest);
	     
	}

}
