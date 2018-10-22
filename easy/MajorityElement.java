// Majority Element

public class Solution {
	// initial solution, without sorting the array
    public int majorityElement1(int[] nums) {
    	// only one element, automatic majority
    	if (nums.length == 1) {
    		return nums[0];
    	}

    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int half = nums.length / 2;

    	for (int n : nums) {
    		// number doesn't already exist
    		if (map.get(n) == null) {
    			map.put(n, 1);
    		} else {
    			int appearances = map.get(n)+1;
    			if (appearances > half) {
    				return n;
    			}
    			map.put(n, appearances);
    		}
    	}

    	// should never happen
    	return -1;
    }

    // (much faster and simpler) solution, with sorting the array
    public int majorityElement2(int[] nums) {
    	Arrays.sort(nums);

    	// since the majority element occurs more than n/2 times, (n = number of elements in the array)
    	// the element at sorted index n/2 is always the majority element
    	return nums[nums.length / 2];
    }
}