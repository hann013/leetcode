// Remove Duplicates from Sorted Array

public class Solution {
	public int removeDuplicates(int[] nums) {
	    if (nums.length <= 1) {
	        return nums.length;
	    }

		int newSize = 1;
		int currentVal = nums[0];	    

		for (int i = 1; i < nums.length; i++) {
			// not a duplicate
			if (nums[i] != currentVal) {
				if (i > newSize) {
					nums[newSize] = nums[i];
				}
				
				currentVal = nums[i];
				newSize++;
			}
		}

		return newSize;
	}
}