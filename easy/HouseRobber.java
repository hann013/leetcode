// House Robber

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int evenProfit = 0;
        int oddProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenProfit += nums[i];
                evenProfit = Math.max(evenProfit, oddProfit);
            } else {
                oddProfit += nums[i+1];
                oddProfit = Math.max(evenProfit, oddProfit);
            }
        }

        return Math.max(evenProfit, oddProfit);
    }
}