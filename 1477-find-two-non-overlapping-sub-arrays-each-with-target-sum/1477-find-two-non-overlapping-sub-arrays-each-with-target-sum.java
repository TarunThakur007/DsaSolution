class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            best[i] = Integer.MAX_VALUE;
        }
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                int currentLen = right - left + 1;
                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, best[left - 1] + currentLen);
                }
                minLen = Math.min(minLen, currentLen);
            }
            if (minLen != Integer.MAX_VALUE) {
                best[right] = minLen;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}   