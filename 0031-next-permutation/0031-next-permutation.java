class Solution {
    public void sortColors(int[] nums) {
        int  low=0;
        int med=0;
        int high=nums.length-1;
        int temp;
        while(med<=high){
            if(nums[med]==0){
                temp=nums[low];
                nums[low]=nums[med];
                nums[med]=temp;
                med++;
                low++;
            }
            else if(nums[med]==1){
                med++;
            }
            else{
                temp=nums[med];
                nums[med]=nums[high];
                nums[high]=temp;
                high--;
            }

        }
    
    }
}