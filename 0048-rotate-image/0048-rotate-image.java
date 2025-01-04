class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        
        for(int i=0; i<n; i++){
            
            int a=0, b=m-1;
            while(a<b){
                int temp= matrix[i][a];
                matrix[i][a]= matrix[i][b];
                matrix[i][b]= temp;
                a++; b--;
            }
        }
    }
        
}