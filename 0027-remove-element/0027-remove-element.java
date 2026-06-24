class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int j=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                count++;
                j++;
            }
        }
        return count;
    }
}