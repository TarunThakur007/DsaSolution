class Solution {
    public int arrangeCoins(int n) {
    //     int row=0;
    //     while(n>=row+1){
    //         row++;
    //         n-=row;
    //     }
    //     return row;
    // }

        long left = 1;
        long right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = mid * (mid + 1) / 2;
            if (coins == n) {
                return (int) mid;
            }
            else if (coins < n) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}
