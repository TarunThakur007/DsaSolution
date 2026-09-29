class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int n = a.length()-1;
        int m = b.length()-1;
        int carry = 0;
        while(n>=0 || m>=0 || carry>0){
            int digitA = (n >= 0) ? a.charAt(n) - '0' : 0;
            int digitB = (m >= 0) ? b.charAt(m) - '0' : 0;
            int currentSum = digitA + digitB + carry;
            result.append(currentSum % 2);
            carry = currentSum / 2;
            n--;
            m--;
        }
        return result.reverse().toString();
    }
}