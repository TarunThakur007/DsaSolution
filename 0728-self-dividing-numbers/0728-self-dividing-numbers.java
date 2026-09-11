class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean divisible = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    divisible = false;
                    break;
                }
                num /= 10;
            }
            if (divisible) {
                ans.add(i);
            }
        }
        return ans;
    }
}
