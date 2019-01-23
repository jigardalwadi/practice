import java.util.Arrays;

public class Sort {
	public static void printarray(int[] arr) {
		for(int i =0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {6,40,15,21,2};
		//static method so no need of object

		printarray(arr);
		/*BubbleSort bs = new BubbleSort();
		bs.bubble(arr);
		*/
		MergeSort mg = new MergeSort();
		mg.sort(arr,0,arr.length-1);

		System.out.println("array after sorting");
		printarray(arr);
	}

}
