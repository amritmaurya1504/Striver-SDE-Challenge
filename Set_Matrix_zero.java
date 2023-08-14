

class Set_Matrix_zero {
    // BRUTE FORCE SOLUTION

    public void rowZero(int row, int[][] matrix){
        int m = matrix[0].length;
        for(int i = 0; i< m; i++){
            matrix[row][i] = 0;
        }
    }
    public void colZero(int col, int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i< n; i++){
            matrix[i][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] dummy = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    dummy[i][j] = true;
                }
            }
        }

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(matrix[row][col] == 0 && dummy[row][col]){
                    rowZero(row, matrix);
                    colZero(col, matrix);
                }
            }
        }
    }
}


// OPTIMAL SOLUTION

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] rowArr = new boolean[n];
        boolean[] colArr = new boolean[m];
       
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    rowArr[i] = true;
                    colArr[j] = true;
                }
            }
        }

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(rowArr[row] || colArr[col]){
                    matrix[row][col] = 0;
                }
            }
        }
    }
}