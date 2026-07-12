class Solution {
    public static int factor(int min,int max,int x){
        if(x==1) return 1;
        if(max%x==0 && min%x==0) return x;
        return factor(min,max,x-1);
    }
    public int findGCD(int[] nums) {
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
    
        return factor(min, max, min);
    }
}