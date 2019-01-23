import java.util.*;

public class Binaryconsecutive {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String st = "";
            int max = 0;
            int max1 = 0;
         
            while(n>0){
                int a = n%2;
                if(a == 1){
                    max1 = max1+1;
                    max = max1;
                  // System.out.println(max);
                }else{
                    if(max < max1){
                        max = max1;
                        max1 = 0;
                    }
                    else {
                        max1 = 0;
                    }
                }
                st = a + st;
                n = n/2;
            }
            
            System.out.println(max);
       // 
        scanner.close();
    }
}
