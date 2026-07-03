class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        while(n>=2){
            x=n%2+x;
            n/=2;
            
        }
        if(n==1 && x==0) return true;
        else return false;
    }
}