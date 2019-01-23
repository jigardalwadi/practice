
class RegexMAtching {
    public static boolean isMatch(String s, String p) {
        boolean[][] f = new boolean[s.length() + 1][p.length() + 1];
        f[0][0] = true;     
        for (int i = 1; i < p.length(); i++){    // start from 1
            if (p.charAt(i) == '*'){
                f[0][i + 1] = f[0][i - 1];
            }
        }
        
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < p.length(); j++){
               if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'){      // one case
                    f[i + 1][j + 1] = f[i][j];
                }
                if (p.charAt(j) == '*'){
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.'){     // * treated as empty preceding element, rememeber
                        f[i + 1][j + 1] = f[i + 1][j - 1];                            // there are two conditions not just the first one
                    }
                    else{
                        f[i + 1][j + 1] = f[i + 1][j - 1] || f[i][j + 1] || f[i + 1][j];  // * treated as empty or mutiple or single 
                    }                                                                     // preceding element
                }
            }
        }
        return f[s.length()][p.length()];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mississippi";
		String p = "mis*is*ip*i";
		
		System.out.println(isMatch(s,p));
		
	}

}
