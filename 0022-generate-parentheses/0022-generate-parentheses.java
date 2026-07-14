class Solution {
    static List<String> arr= new ArrayList<>();
    public static void print(int open ,int close ,int n,String s){
        int m=s.length();
        if(m==n*2) {arr.add(s);
        return;}
        if(open< n) print(open+1,close,n,s+'(');
        if(close<open) print(open,close+1,n,s+')');
    }
    public List<String> generateParenthesis(int n) {
        arr.clear();
        print(0,0,n,"");
        return arr;
    }
}