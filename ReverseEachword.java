public class ReverseEachword {
	
	public String reverse(String st) {
		
		String[] words = st.split(" ");
		String rev = "";
		for(String s : words) {
			int len = s.length();
			
	        for(int i = len-1; i >= 0; i--)
	        {
	            rev = rev + s.charAt(i);
	            
	        }
	        rev = rev + " ";
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String st = "My name is jigar";
		ReverseEachword rew = new ReverseEachword();
		System.out.println(rew.reverse(st));
		
	}

}
