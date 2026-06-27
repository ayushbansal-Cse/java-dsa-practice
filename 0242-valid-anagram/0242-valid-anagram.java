class Solution {
    public boolean isAnagram(String s, String t) {
        int a=s.length();
        int b=t.length();
        int []freqs=new int[256];
        if(a!=b) return false;
        for(int i=0;i<a;i++){
            char ch =s.charAt(i);
            freqs[ch]++;
        }
        for(int i=0;i<b;i++){
            char ch1=t.charAt(i);
            freqs[ch1]--;
        }
        for(int ele:freqs){
            if(ele!=0) return false;
        }
        return true;
    }
}