class Solution {
    public void rotate(int[][] matrix) {

        // Traverse matrix and reverse every row
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            int a = 0, b = col - 1;
            while (a < b) {
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++;
                b--;
            }
        }
    }
}