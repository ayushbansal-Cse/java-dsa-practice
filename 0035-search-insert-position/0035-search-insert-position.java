class Solution {
    public int searchInsert(int[] nums, int target) {
            int l=0;int h=nums.length-1;int lb=nums.length;
            while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=target){
                lb=Math.min(lb,mid);
                h=mid-1;
                
            } 
            else l=mid+1;
        }
         return lb;
    }
}