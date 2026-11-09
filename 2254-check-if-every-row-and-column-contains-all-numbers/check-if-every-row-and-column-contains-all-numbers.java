class Solution {
    public boolean checkValid(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i<m; i++)
        {
            boolean[] row = new boolean[m+1];
            boolean[] col = new boolean[n+1];

            for(int j = 0; j<n; j++)
            {
                int rowV = matrix[i][j];
                int colV = matrix[j][i];

                if (row[rowV] || col[colV]) 
                {
                    return false;
                }
                
                row[rowV] = true;
                col[colV] = true;
            }
        }
        return true;
    }
}