class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
       int m = matrix.length; 
       int n = matrix[0].length;
       int answer[][] = new int[m][n];
       
       for(int i = 0; i<m; i++)
       {
        for(int j = 0; j<n; j++)
        {
            answer[i][j] = matrix[i][j];
        }
       }
       int col[] = new int[n];

        for(int j =0; j<n; j++)
        {
            int max = -1;
            for(int i =0; i<m; i++)
            {
                max = (int)Math.max(max, answer[i][j]);
            }
            col[j] = max;
        }
    
        for(int i = 0; i<m; i++)
       {
        for(int j = 0; j<n; j++)
        {
            if(answer[i][j] == -1)
            {
                answer[i][j] = col[j];
            }
        }
       }
       return answer;
    }
}