// Ugly Number

public class Solution {
    public boolean isUgly(int num) {
        // negative numbers will always have a prime factor of -1, and 0 isn't a prime number
        if (num <= 0) {
            return false;
        }

        while (num != 1) {
            if (num % 5 == 0) {
                num /= 5;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 2 == 0) {
                num /= 2);
            } else {
                return false;
            }
        }
        
        return true;
    }
}