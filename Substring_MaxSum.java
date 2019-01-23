public class Substring_MaxSum {
//	
//	
//	static int sum(int[] arr) {
//		int sm = arr[0];
//		for(int i =0; i< arr.length;i++) {
//			for(int j = i; j<arr.length; j++) {
//				int sum = MaxSum(arr,i,j);
//				if(sm < sum ) {
//					sm = sum;
//					
//				}
//			}
//		}
//		return sm;
//	}
//	public static int MaxSum(int[] arr, int i, int j) {
//		int sum_i = arr[i];
//		for( int a = i+1; a<=j;a++) {
//			sum_i = sum_i + arr[a]; 
//		}
//		return sum_i;
//	}
	
		public int maxSubArray(int[] A) {
		    int max = Integer.MIN_VALUE, sum = 0;
		    for (int i = 0; i < A.length; i++) {
		        if (sum < 0) 
		            sum = A[i];
		        else 
		            sum += A[i];
		        if (sum > max)
		            max = sum;
		    }
		    return max;
		}
	
	public static void main(String[] args) {
		int[] nums = new int[] {-5,-2,-1,-4,-7,-2};
		Substring_MaxSum sm1 = new Substring_MaxSum();
		System.out.println(sm1.maxSubArray(nums));
		
	}
}