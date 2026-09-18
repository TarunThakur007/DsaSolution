class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[128];
        int count = 0;
        for(int i : jewels.toCharArray()){
            arr[i] = 1;
        }
        for(int j : stones.toCharArray()){
            if(arr[j]==1){
                count++;
            }
        }
        return count;
    }
}