class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for(char ch : s.toCharArray()){
            arr[ch]++;
        }
        int a=0;
        boolean odd = false;
        for(int count : arr){
            a+=(count/2)*2;
            if(count%2==1){
                odd = true;
            }
        }
        // if(odd){
        //     a+=1;
        // }
        // return a;
        return odd?a+1:a;
    }
}