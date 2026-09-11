class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                int element = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                currentRow.add(element);
            }
            if (i > 0) {
                currentRow.add(1);
            }
            ans.add(currentRow);
        }
        return ans;
    }
}
