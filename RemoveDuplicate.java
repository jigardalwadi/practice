import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public Set<Integer> remdup(int[] arr) {
		Set<Integer> st = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
//			if(st.contains(arr[i]) == false) {
//				st.add(arr[i]);
//			}
			st.add(arr[i]);
		}
		return st;
 	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,1,2,3,4};
		RemoveDuplicate rd = new RemoveDuplicate();
		System.out.println(rd.remdup(arr));
		
	}

}
