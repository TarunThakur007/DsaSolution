class Solution {
    public String addBinary(String a, String b) {
        // StringBuilder result = new StringBuilder();
        // int n = a.length()-1;
        // int m = b.length()-1;
        // int carry = 0;
        // while(n>=0 || m>=0 || carry>0){
        //     int digitA = (n >= 0) ? a.charAt(n) - '0' : 0;
        //     int digitB = (m >= 0) ? b.charAt(m) - '0' : 0;
        //     int currentSum = digitA + digitB + carry;
        //     result.append(currentSum % 2);
        //     carry = currentSum / 2;
        //     n--;
        //     m--;
        // }
        // return result.reverse().toString();
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j--;
            }
            s.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            s.append(carry);
        }
        return s.reverse().toString();
    }
}