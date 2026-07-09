class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==nums[j]) break;
                if(i!=nums[j] && j==n-1) return i;
            }
        }
        return 0;
    }
}