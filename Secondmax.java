
public class Secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{ -4,-7,-1,-9,-2 };
		int max;
		int smax;
		if(a[0] > a[1]) {
			max = a[0];
			smax = a[1];
		}
		else {
			max = a[1];
			smax = a[0];
		}
		
		for(int i=2; i< a.length; i++) {
			if(a[i]>smax) {
				if(a[i] < max) {
						smax = a[i];
				}
				else {
					smax = max;
					max = a[i];
				}
			}
		} 
		System.out.println(smax +" "+ max);
	}
		
}
