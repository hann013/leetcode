// Happy Number

public class Solution {
    HashSet<Integer> nonHappyNums = new HashSet<Integer>();
    
    public boolean isHappy(int n) {
        // found a happy number
        if (n == 1) {
            return true;
        }

        // looped back to a value, so must not be a happy number
        if (nonHappyNums.contains(n)) {
            return false;
        }
        
        // keep track of already-checked non-happy numbers
        nonHappyNums.add(n);
        return isHappy(sumOfDigits(n));
    }

    int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;  
        }
        return sum;
    }
}