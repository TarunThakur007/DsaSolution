class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int z=0;
        int l=0;
        int length=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){ 
                z++;
            }    
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }    
            length=Math.max(length,right-l+1);
        }
        return length;
    }
}