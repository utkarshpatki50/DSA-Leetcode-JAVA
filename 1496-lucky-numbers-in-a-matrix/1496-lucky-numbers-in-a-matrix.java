class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;

        List<Integer> ans= new ArrayList<>();
        for(int i=0; i<m; i++){
            int colIndex=0;
            int minValue= matrix[i][0];
            for(int j=1; j<n; j++){
                if(matrix[i][j] < minValue){
                    minValue= matrix[i][j];
                    colIndex= j;
                }
            }

            boolean isMaxInColumn= true;
            for(int k=0; k<m; k++){
                if(matrix[k][colIndex] > minValue){
                    isMaxInColumn= false;
                    break;
                }
            }

            if(isMaxInColumn != false){
                ans.add(minValue);
            }
        }

        return ans;

    }
}