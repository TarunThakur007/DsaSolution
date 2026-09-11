class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length-1;
        int s=0;
        while(s<n){
            if(nums[s]%2==0){ 
                s++;
            }
            else if(nums[n]%2!=0){ 
                n--;
            }
            else{
                int temp = nums[s];
                nums[s] = nums[n];
                nums[n] = temp;
                s++;
                n--;
            }
        }
        return nums;
    }
}