// Remove Element

public class Solution {
	public int removeElement(int[] nums, int val) {
		int newSize = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				// remove element if element that's not the value to be removed is found
				// beyond the last index of the already-updated array 
				if (i > newSize) {
					nums[newSize] = nums[i];
				}
				newSize++;
			}
		}

		return newSize;
	}
}