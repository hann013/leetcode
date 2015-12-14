// Add Digits

public class Solution {
    public int addDigits(int num) {
    	// special case: result is only ever 0 if num = 0
    	if (num == 0) {
    		return 0;
    	}

        // the possible solution are between 1 and 9, and they always occur in order beginning from 1
    	if (num % 9 == 0) {
    		return 9;
    	}
        return num % 9;
    }
}