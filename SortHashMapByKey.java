import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortHashMapByKey {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		
		map.put("Vraj", 13);
		map.put("Aarsh",30);
		map.put("Jigar",7);
		map.put("Raj", 10);
		map.put("Yash", 3);
		
		
		// To iterate will declare a variable of type map 
		// just like int i --> Map.Entry<String, Integer> entry
		// map.entrySet is a method of calling map set.
		//Map.Entry<String, Integer> entry : map.entrySet()
		
		 for (Map.Entry<String, Integer> entry : map.entrySet())  {
			 System.out.println("Key =" + " " +entry.getKey() + " " + "Value = "+entry.getValue());
		 }
		
	}

}
