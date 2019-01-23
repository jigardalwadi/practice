class Zigzag {
    public static String convert(String s, int numRows) {
        // finding the next top
        int n = 2*numRows-2;
        char[] chs = s.toCharArray();
        String re = "";
       
        if(numRows == 1){
            re = s;
        }
        else{
            // loop as many times as the number of rows
            for(int i = 0; i < numRows; i++){
                // starting from first char index 
                int index = i;
                int ln = s.length();
                while(index < s.length()){
                    re += chs[index];
                    int cal = index/n*n+n-i;
                    if(numRows>2 && cal < s.length() && i!=numRows-1 && i!=0){
                        re += chs[index/n*n+n-i];
                    }
                     index += n;
                    
                }
            }    
        }
        
        return re;
    }
    
    public static void main(String[] args) {
    	String s = "abcdefgh";
    	
    	int row = 3;
    	System.out.println(Math.abs(row));
    	String ans = convert(s,row);
    	System.out.println(ans);
    }
}