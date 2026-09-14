class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            int min = Integer.MAX_VALUE;
            int col=-1;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    col=j;
                }
            }
            boolean lucky = true;
            for (int k = 0; k < m; k++){
                if (matrix[k][col] > min){
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                ans.add(min);
            }
        }
        return ans;
    }
}