// Move Zeroes

public class Solution {
	// initial solution, however although this solution was accepted, 
	// it takes too much time
	public void moveZeroes1(int[] nums) {
		int firstZeroIndex = nums.length - 1;

		// whenever a zero is found, shift the array down
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0) {
				for (int j = i; j <= firstZeroIndex; j++) {
					nums[j] = nums[j+1];
				}
				nums[firstZeroIndex] = 0;
				firstZeroIndex--;
			}
		}
	}

	// optimized solution
    public void moveZeroes2(int[] nums) {
        int lastNonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] != 0) {
        		nums[lastNonZeroIndex] = nums[i];
        		lastNonZeroIndex++;
        	}
        }

        for (int i = lastNonZeroIndex; i < nums.length; i++) {
        	nums[i] = 0;
        }
    }
}