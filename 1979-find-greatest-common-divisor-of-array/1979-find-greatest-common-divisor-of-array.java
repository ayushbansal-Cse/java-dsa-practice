class Solution {
    public static int factor(int min,int max){
        if(min==0) return max;
        return factor(max%min,min);
    }
    public int findGCD(int[] nums) {
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
    
        return factor(min, max);
    }
}