class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j-1]==nums[j]) continue;
            int low=j+1;int high=nums.length-1;
            while(low<high){
                long sum=(long)nums[i]+nums[j]+nums[low]+nums[high];
                if(sum==target) {
                    arr.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                    while(low<high && nums[low]==nums[low+1]) low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    low++;high--;
                }else if(sum<target) low++;
                else high--;
            }
        }} 
        return arr; 
    }
}