import java.math.BigInteger;

public class number {
		
		   public int myAtoi(String str) {
		        if (str == null) return 0;
		        String word = str.trim();

		        if (word.length() == 0) return 0;

		        BigInteger number = BigInteger.valueOf(0);
		        BigInteger ten = BigInteger.valueOf(10);

		        for (int i = 0; i < word.length(); i++) {
		            char d = word.charAt(i);

		            if (d == '+' || d == '-') {
		                if (i == 0) continue;
		                else break;
		            }

		            if (!Character.isDigit(d)) break;

		            number = number.multiply(ten).add(BigInteger.valueOf(Character.digit(d, 10)));
		        }

		        boolean negative = word.charAt(0) == '-';
		        if (negative) {
		            number = number.negate();
		        }

		        if (number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 ||
		                number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
		            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		        }

		        return number.intValue();
		    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
