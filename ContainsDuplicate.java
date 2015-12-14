// Contains Duplicate

public class Solution {
	// initial solution; exceeded time limit
    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> dupes = new HashSet<Integer>();

        for (int n : nums) {
        	if (dupes.contains(n)) {
        		// found a duplicate
        		return true;
        	}
    		// add to the hashset
    		dupes.add(n);
        }
        return false;
    }

    // learned that add() method returns false if the set already contains the element,
    // which reduces the number of operations and thus cuts down the runtime
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> dupes = new HashSet<Integer>();

        for (int n : nums) {
        	if (!dupes.add(n)) {
        		// found a duplicate
        		return true;
        	}
        }
        return false;
    }
}