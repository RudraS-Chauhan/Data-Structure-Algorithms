class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int og[][] = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        int k=0;
        if(r*c != m*n)
        return mat;

       for(int i =0; i<m; i++) 
       {
        for(int j =0; j<n; j++)
        {
            og[k/c][k%c] = mat[i][j];
            k++;
        }
       }
       return og;
    }
}