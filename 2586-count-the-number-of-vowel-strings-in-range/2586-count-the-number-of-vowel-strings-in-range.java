class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String str=words[i];
            int len = str.length();
            char first=str.charAt(0);
            char last = str.charAt(len-1);
            if(isvol(first)&&isvol(last)){
                count++;
            }
        }
        return count;
    }
    boolean isvol(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}