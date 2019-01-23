
public class AllUniqueCharInString {

	public static void main(String[] args) {

		String s = "abcab";
		Boolean[] asci = new Boolean[128];
		
		for(int i = 0; i< s.length();i++) {
			int c = s.charAt(i);
			if(asci[c] != null) {
				System.out.println("not unique");
				break;
			}
			asci[c] = true;
			
		}
		System.out.println("unique");
		
	}

}
