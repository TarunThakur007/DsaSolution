class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int l = 0; l < n - 3; l++) {
            if (l > 0 && nums[l] == nums[l - 1]) continue;       // skip dup l
            for (int i = l + 1; i < n - 2; i++) {
                if (i > l + 1 && nums[i] == nums[i - 1]) continue; // skip dup i
                int j = i + 1, r = n - 1;
                while (j < r) {
                    long sum = (long)nums[l] + nums[i] + nums[j] + nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[l], nums[i], nums[j], nums[r]));
                        while (j < r && nums[j] == nums[j + 1]) j++;  // skip dup j
                        while (j < r && nums[r] == nums[r - 1]) r--;  // skip dup r
                        j++;
                        r--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}