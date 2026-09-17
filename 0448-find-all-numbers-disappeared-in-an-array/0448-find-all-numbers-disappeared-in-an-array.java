class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // Set <Integer> set =  new HashSet<>();  
        // for(int i : nums){
        //     set.add(i);
        // }
        // List<Integer> ans = new ArrayList<>();
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){ 
        //         ans.add(i);
        //     }
        // }
        // return ans;
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx] = -nums[idx];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    } 
}