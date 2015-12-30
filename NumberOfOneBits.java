// Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int numberOfOnes = 0;
        
        for (int bit = 0; bit < 32; bit++) {
            if ((n & (1 << bit)) != 0) {
                numberOfOnes++;
            }
        }
        
        return numberOfOnes;
    }
}