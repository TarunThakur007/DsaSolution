class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefix[i]=sum;
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            if(sum1==prefix[n-1]-prefix[i]){
                return i;
            }
            sum1+=nums[i];
        }
        return -1;
    }
}