class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = temp;
            }
            reverse(matrix[i],0,n-1);
        }
    }
    public void reverse(int nums[], int s, int e){ 
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}