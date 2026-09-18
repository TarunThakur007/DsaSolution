class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a = a+s.charAt(i); 
            }
        }
        s=a.toLowerCase();
        int r=0;
        int l=s.length()-1;
        while(r<l){
            if(s.charAt(r)!=s.charAt(l)){
                return false;
            }
                l--;
                r++;
        }
        return true;
    }
}