import java.util.Arrays;
import java.util.Collections;

public class MergeSort {
	
	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			// find the midd point to divide the array
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			// merge it while sorting
			merge(arr,l,m,r);
		}
	}
	
	public void merge(int[] arr, int l, int m, int r) {
		int arr1length = m-l+1;
		int arr2length = r-m;
		
		/*int arr1[] = new int[arr1length];
		int arr2[] = new int[arr2length];
		*/
		int arr1[] = Arrays.copyOfRange(arr, l, m+1);
		int arr2[] = Arrays.copyOfRange(arr, m+1, r+1);
		
		
	   /* for (int i=0; i<arr1length; ++i) {
            arr1[i] = arr[l + i]; 
	    }
        for (int j=0; j<arr2length; ++j) {
            arr2[j] = arr[m + 1+ j]; 
        }*/
		
		int i=0;
		int j = 0;
		int k = l;
		// merge this divided array while sorting
		while(i<arr1length && j < arr2length) {
			if(arr1[i] <= arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}
			else {
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1length) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2length){
			arr[k]=arr2[j];
			j++;
			k++;
		}
		
	}

}
