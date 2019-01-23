import java.util.*;
public class Glasshour {

		 private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        int[][] a = new int[6][6];
		       
		        for (int i = 0; i < 6; i++) {
		            String[] arrRowItems = scanner.nextLine().split(" ");
		            for (int j = 0; j < 6; j++) {
		                int arrItem = Integer.parseInt(arrRowItems[j]);
		                a[i][j] = arrItem;
		            }
		        }
		        int max=0;
		       int s;
		        
		    for(int i=0; i<(a.length-2); i++) {

		        for(int j=0;j<(a.length-2);j++) {
		        	if(i==0 && j==0) {
		        		max = a[0][0]+a[0][1]+a[0][2]+a[1][1]+a[2][0]+a[2][1]+a[2][2];
		        	}
		        	

		            s = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]+a[i+1][j+1];

		            if(max<=s){
		                max=s;
		            }
		        }
		    }
		    System.out.println(max);
		        scanner.close();
		    }
	}


