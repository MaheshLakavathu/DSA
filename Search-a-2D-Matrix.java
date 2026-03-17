1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        for(int i = 0; i < m; i++){
8            for(int j = 0; j < n; j++){
9                if(matrix[i][j] == target){
10                    return true;
11                }
12            }
13        }
14
15        return false;
16    }
17}