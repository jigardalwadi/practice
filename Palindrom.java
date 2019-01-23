
public class Palindrom {

	public static boolean palindrom(String s){
		String reverse ="";
		for(int i = s.length()-1; i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		
		return s.equalsIgnoreCase(reverse);
	}
	
	public static void main(String[] args) {
		String s = "MyM";
		System.out.println(palindrom(s));
	}

}
