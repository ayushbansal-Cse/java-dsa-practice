class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int [][]arr=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[n-j-1][i];
            }
        }
        
    }
}