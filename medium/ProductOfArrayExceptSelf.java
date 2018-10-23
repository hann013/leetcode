class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        
        products[0] = 1;
                
        for (int i = 1; i < nums.length; i++) {
            // store product of numbers before it 
            products[i] = products[i-1] * nums[i-1];
        }
        
        int right = 1;
        
        for (int i = nums.length - 1; i > 0; i--) {
            // multiply by product of numbers after it
            right *= nums[i];
            products[i-1] *= right;
        }
        
        return products;
    }
}