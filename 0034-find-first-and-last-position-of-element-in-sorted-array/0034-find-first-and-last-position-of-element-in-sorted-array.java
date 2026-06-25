class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;int high=nums.length-1;
        int lb=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                lb=Math.min(mid,lb);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int l=0;int h=nums.length-1;
        int ub=nums.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>target){
                ub=Math.min(mid,ub);
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
            if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }
        return new int[] {lb,ub-1};
    }
}