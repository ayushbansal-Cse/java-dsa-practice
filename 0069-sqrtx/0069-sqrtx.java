class Solution {
    public int mySqrt(int x) {
        long low=0;long high=x;long mid=0;
        while(low<=high){
            mid =low+(high-low)/2;
            long sqr=mid*mid;
            if(sqr ==x) return (int)mid;
            else if(sqr>x) high=mid-1;
            else if(sqr<x) low=mid+1;
        }
        return (int)high;
    }
}