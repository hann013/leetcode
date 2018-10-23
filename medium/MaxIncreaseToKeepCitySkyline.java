class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int[] tbSkyline = new int[cols];
        int[] lrSkyline = new int[rows];
        
        // Get skylines
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int val = grid[r][c];
                
                // For top-bottom skyline, compare column values
                if (val > tbSkyline[c]) {
                    tbSkyline[c] = val;
                }
                
                // For left-right skyline, compare row values
                if (val > lrSkyline[r]) {
                    lrSkyline[r] = val;
                }
            }
        }
        
        int result = 0;
        
        // Get increase amount for each building
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int val = grid[r][c];
                // Max increase is minimum between top-bottm and left-right for the column and row
                int min = Math.min(tbSkyline[c], lrSkyline[r]);
                int diff = min - val;
                
                if (diff > 0) {
                    result += diff;
                }
            }
        }
        
        return result;
    }
}