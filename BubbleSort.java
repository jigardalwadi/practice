
public class BubbleSort {
	public void bubble(int[] arr) {
		int n = arr.length-1;
		//boolean swapped;
		for(int i=0 ; i< n; i++) {
			//swapped = false;
			for(int j=0;j<n-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					int temp2 = arr[j+1];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					//swapped = true;
				}
				
			}
/*			if(swapped = false) {
				break;
			}
*/		}
		
	}
}
