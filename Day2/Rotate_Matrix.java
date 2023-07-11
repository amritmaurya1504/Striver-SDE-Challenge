package Day2;

class Rotate_Matrix {
    public void rotate(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
// first doing transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reversing the row elements;
        for(int i = 0; i < n; i++){
            int l = 0;
            int r = n - 1;
            while(l < r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++; r--;
            }
        }
       
    }
}