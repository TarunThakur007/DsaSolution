class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k=0;
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean alreadyPresent = false;
            for (int x = 0; x < k; x++) {
                if (ans[x] == nums1[i]) {
                    alreadyPresent = true;
                    break;
                }
            }
            if (alreadyPresent) {
                continue;
            }
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[k] = nums1[i];
                    k++;
                    break;
                }
            }
        }
        return Arrays.copyOf(ans, k);
    }
}