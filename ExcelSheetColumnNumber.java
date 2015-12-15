// Excel Sheet Column Number

public class Solution {
    public int titleToNumber(String s) {
	    char[] s_array = s.toCharArray();
    	int lastIndex = s_array.length - 1;
    	int result = 0;

    	for (int i = 0; i <= lastIndex; i++) {
    		// get integer value of character - A = 1, B = 2, etc
    		int c = (int) s_array[i] - 64;
    		result += c * Math.pow(26, lastIndex - i);
    	}

    	return result;
	}
}