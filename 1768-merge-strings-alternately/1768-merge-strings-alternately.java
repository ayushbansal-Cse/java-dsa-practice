class Solution {
    public String mergeAlternately(String b, String c) {
        StringBuilder s=new StringBuilder();
        int m=c.length();
        int n=b.length();
        int max=Math.max(n,m);
        int i=0;int j=0;
        while(i<n && j<m){
            s.append(b.charAt(i));
            s.append(c.charAt(j));
        i++;j++;
        }
        while(i<n){
            s.append(b.charAt(i));
            i++;
        }
        while(j<m){
            s.append(c.charAt(j));
            j++;
        }
        return s.toString();
    }
}