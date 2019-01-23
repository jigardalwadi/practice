import java.util.regex.*;  
public class StringtoArray   
{  
	
	 int j=12;  
	    void add()  
	    {  
	        j=j+12;  
	        System.out.println("J="+j);  
	    }  
	    public void finalize()  
	    {  
	        System.out.println("Object is garbage collected");  
	    }  
    public static void main (String args[]) throws Exception
    {  
    	/*Email email;
    	*/
        String s = "Sharma is a good player and he is so punctual";  
        char[] stringToCharArray = s.toCharArray();
        String[] words = s.split("");  
        System.out.println("The Number of words present in the string are : "+words[1] + stringToCharArray[0]);  
        Runtime.getRuntime().exec("notepad");//will open a new notepad  
        
        
        new StringtoArray().add();  
        System.gc();  
        System.gc();  
        	
        new StringtoArray().add(); 
        
       // System.out.println(Pattern.matches("^[a-zA-Z]", "asa"));
    }  
}  
// sentence to word array is s.split with " " and char array is s.toCharArray()