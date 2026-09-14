class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j]==0){
                    nums[i][j]=1;
                }
                else{
                    nums[i][j]=0;
                }
            }
            rev(nums[i],0,n-1);
        }
        return nums;
    }
    public void rev(int a[],int s,int e){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
    }
}