class Solution {
    static List<List<Integer>> arr;
    public static void set(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> l=new ArrayList<>();
            for(int j= 0;j<ans.size();j++){
                l.add(ans.get(j));
            }
            arr.add(l);
            return;
        }
        
        set(i+1,nums,ans);
        ans.add(nums[i]);
        set(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        arr =new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        set(0,nums,ans);
        return arr;
    } 
}