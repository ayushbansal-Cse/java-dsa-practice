class Solution {
    public int searchInsert(int[] nums, int target) {
            int l=0;int h=nums.length-1;int ub=nums.length;
            while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=target){
                ub=Math.min(ub,mid);
                h=mid-1;
                
            } 
            else l=mid+1;
        }
         return ub;
    }
}