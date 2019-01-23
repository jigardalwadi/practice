import java.util.Scanner;

public class SumfArray {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i< array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i =1;i< array.length;i++) {
			array[i] = array[i]+array[i-1];
		}
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
