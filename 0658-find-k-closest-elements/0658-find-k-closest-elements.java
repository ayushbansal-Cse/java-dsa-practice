class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> a=new ArrayList<>();
        int n= arr.length;
        int low=0;int high=n-1;int lb=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                lb=Math.min(mid,lb);
                high=mid-1;
            } else low=mid+1;
        }
        int left = lb - 1;
int right = lb;

while (k > 0) {
    if (left < 0) {
        a.add(arr[right++]);
    } else if (right >= n) {
        a.add(arr[left--]);
    } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
        a.add(arr[left--]);
    } else {
        a.add(arr[right++]);
    }
    k--;
}

 Collections.sort(a);

        return a;
    }
}