
public class LexicographicOrder {
	
	public int[] lexingtonorder(int[] arr) {
		// i is the position of the element which is smaller then it's next one.
		int i = arr.length-2;
		while(i>=0 && arr[i + 1] <= arr[i]) {
			i--;
		}
		// j is to find a bigger element then i to swap from the end
		if(i>=0) {
			int j = arr.length-1;
			while(j>=0 && arr[j]<=arr[i]) {
				j--;
			}
			int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
		}
		
		int k = i+1;
		int m = arr.length-1;
		while(k<m) {
			int temp = arr[k];
	        arr[k] = arr[m];
	        arr[m] = temp;
	        k++;
	        m--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		LexicographicOrder lo = new LexicographicOrder();
		int[] ar = lo.lexingtonorder(arr);
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
		
	}
}
