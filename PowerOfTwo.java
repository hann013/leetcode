// Power of Two

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        int numberOfOneBits = 0;
        
        for (int bit = 0; bit < 32; bit++) {
            if ((n & (1 << bit)) != 0) {
                numberOfOneBits++;
            }
        }
        
        // numbers that are a power of two only have one 1 bit 
        return numberOfOneBits == 1;
    }
}