	class ReverseNumber {
    public static int reverse(int x) {
        int y = Math.abs(x);
        if(x == y){
        int b=Integer.toString(x).length()-1;
        String str1 = Integer.toString(x);
        String re = "";
        while(b>=0){
            re += str1.charAt(b);
            b--;
        }
        return Integer.parseInt(re);
            
        }
        else{
            // x is negative
            int b=Integer.toString(y).length()-1;
            String str1 = Integer.toString(y);
            String re = "";
            while(b>=0){
                re += str1.charAt(b);
                b--;
            }
            
            return 0 - Integer.parseInt(re);
            
        }
        
    }
    
    public static void main(String[] args) {
    	int n = 1569;
    	int rev = reverse(n);
    	System.out.println(rev);
    }
    
}