class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length-1;
        int pivot=-1;
        for(int i=n;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot!=-1){
        for(int i=n;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,pivot,i);
                break;
            }
        }
        }
        rev(nums,pivot+1,n);
    }
        public static void swap(int [] nums,int x,int y ) {
            int temp;
            temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
        }
        public static void rev(int []nums,int a,int b){
            int temp;
            while(a<=b){
                temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;
            }
        }
    }
