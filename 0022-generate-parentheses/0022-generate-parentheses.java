class Solution {
    List<String> ans;
    public void solve(int n,int open, int close, String temp){
        if(open==n && close==n){
            ans.add(temp);
            return;
        }
        if(open<n){
            solve(n,open+1,close,temp+'(');
        }
        if(close<open){
            solve(n,open,close+1,temp+')'); 
        }
    }
    public List<String> generateParenthesis(int n) {
        ans =new ArrayList<String>();
        solve(n,0,0,"");
        return ans;
    }
}