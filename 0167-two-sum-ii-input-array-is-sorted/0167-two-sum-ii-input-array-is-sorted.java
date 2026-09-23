class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int p=0;
        int q=numbers.length-1;
        while(p<q){
            if(numbers[p]+numbers[q]<target){
                p++;
            }else if(numbers[p]+numbers[q]>target){
                q--;
            }else{
                ans[0]=p+1;
                ans[1]=q+1;
                break;
            }
        }
        return ans;
    }
}