class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int max=0;int sum=0;int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int low=max;int high=sum; int minc=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(carry(mid,arr,days)==true){
                minc=mid;
                high=mid-1;
            }else low=mid+1;

        } 
        return minc;
    }
    public static boolean carry(int c,int []arr, int d){
        int n=arr.length;
        int load=0;
        for(int i=0;i<n;i++){
            if(load+arr[i]<=c) load+=arr[i];
            else {
                load=arr[i];
                d--;
            }
        }
        if(d<1) return false;
        else return true;

    }
}