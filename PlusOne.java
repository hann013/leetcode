// Plus One

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int d = digits[i];
            
            // Can simply add 1 and return answer
            if (d != 9) {
                digits[i] = d + 1;
                return digits;
            }
            
            // Digit was a 9, results in carry
            digits[i] = 0;
            
            // Reached first digit, need to create new array
            if (i == 0) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                for (int j = 1; j < newDigits.length; j++) {
                    newDigits[j] = 0;
                }
                return newDigits;
            }
        }
        
        return digits;
    }
}