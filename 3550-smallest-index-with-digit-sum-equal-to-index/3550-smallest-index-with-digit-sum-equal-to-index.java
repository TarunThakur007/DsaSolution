class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0; 
            int temp = nums[i];
            if (temp == 0) {
                sum = 0;
            } else {
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
            }
            if (sum == i) {
                return i; 
            }
        }
        return -1; 
    }
}   