import java.util.Scanner;

public class Fibonacii {
	
	static int total=0;
	public static void main(String[] args) {
		
		
		
		int num = 4;
		for(int i=1; i<=num; i++) {
		 
		System.out.println(fib(num));
		}
		System.out.println(total);
	}
	
	public static int fib(int num) {
		
		if(num < 2) {
			
			return 1;
		}
		else {
		
			return fib(num - 1) + fib(num -2);
		}
		
	}

}
