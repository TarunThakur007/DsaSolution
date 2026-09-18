class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a = a+s.charAt(i); 
            }
        }
        int r=0;
        int l=a.length()-1;
        while(r<l){
            if(a.charAt(r)!=a.charAt(l)){
                return false;
            }
                l--;
                r++;
        }
        return true;
    }
}