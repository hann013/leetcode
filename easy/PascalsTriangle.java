class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> result = new ArrayList<>();
            
            // All rows begin with 1
            result.add(1);

            // All rows except the first two contain the sum of  values in the previous row
            if (i > 1) {
                List<Integer> prevRow = triangle.get(i-1);
                for (int j = 1; j < prevRow.size(); j++) {
                    result.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            
            // All rows except the first end with 1
            if (i > 0) {
                result.add(1);
            }
            
            triangle.add(result);
        }
        return triangle;
    }
}