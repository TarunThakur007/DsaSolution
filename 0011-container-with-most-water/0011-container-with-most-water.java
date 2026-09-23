class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxWater = 0;
        // while (l < r) {
        //     maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
        //     if (height[l] < height[r]) l++;
        //     else r--;
        // }
        // return maxArea;
        for(;l<r;){
            if(height[l]<height[r]){
                int area = height[l] *(r-l);
                l++;
                if(maxWater<area) maxWater = area;
            }else{
                int area =height[r]*(r-l);
                r--;
                if(area>maxWater) maxWater = area;

            }
        }
        return maxWater;
    }
}   
