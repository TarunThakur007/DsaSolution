class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] ans=new int[m+n];
        // for(int i=0;i<m;i++){
        //     ans[i]=nums1[i];
        // }
        // for(int i=0;i<n;i++){
        //     ans[m+i]=nums2[i];
        // }
        // for (int i = 0; i < m + n; i++) {
        //     nums1[i] = ans[i];
        // }
        // Arrays.sort(nums1);
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}