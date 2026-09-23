class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[l]){
                count++;
                l++;
                nums[l]=nums[i];
            }
        }
        return count+1;
    }
}