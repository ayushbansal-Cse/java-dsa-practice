class Solution {
    public int[] sortedSquares(int[] arr) {
        int i=0;int j=arr.length-1;
        int [] arr2=new int [arr.length];
        int k=arr.length-1;
        while(i<=j){
            if(Math.abs(arr[i])<Math.abs(arr[j])){
                arr2[k]=arr[j]*arr[j];
                j--;k--;
            }
            else {
                arr2[k]=arr[i]*arr[i];
                i++;
                k--;

            }
        }
        return arr2;
    }
}