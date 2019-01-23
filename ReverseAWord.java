/* package whatever; // don't place package name! */

import java.io.*;

class ReverseAWord
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
   // System.out.println(input);
    
    String[] words = input.split(" ");
    int wordposi = Integer.parseInt(words[words.length-1]);
    String torev = words[wordposi];
    String rev = "";
    for(int i = torev.length()-1;i>=0; i--) {
      
              rev = rev + torev.charAt(i);
              
          }
         
    
    words[wordposi] = rev;
    for(int i=0;i<words.length;i++){
      System.out.print(words[i] + " ");
    }
    
  }
    
  
}
