// Nim Game

public class Solution {
    public boolean canWinNim(int n) {
    	// can only win if n isn't a multiple of 4; since you can only remove 1, 2, or 3 stones, 
    	// with 4 stones the last one will always be removed by the other player
        return n % 4 != 0;
    }
}