class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
            return "";
        }
        int[] arr = new int[num];
        int idx = num-1;
        int dig = 9;
        while(sum>0){
            if(sum>=dig){
                arr[idx--]=dig;
                sum-=dig;
                dig=9;
            }else{
                while(sum<dig){
                    dig--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=num-1;i>=0;i--){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}