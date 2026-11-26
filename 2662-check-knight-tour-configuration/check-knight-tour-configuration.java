class Solution {
    boolean isValid(int grid[][], int r, int c, int n, int exp)
    {
        if(r<0 || c<0 || r>=n || c>=n || grid[r][c] != exp)
        {
            return false;
        }
        if(exp == n*n-1)
        {
            return true;
        }
        boolean a1 = isValid(grid, r-2, c+1, n, exp+1);
        boolean a2 = isValid(grid, r-1, c+2, n, exp+1);
        boolean a3 = isValid(grid, r+1, c+2, n, exp+1);
        boolean a4 = isValid(grid, r+2, c+1, n, exp+1);
        boolean a5 = isValid(grid, r+2, c-1, n, exp+1);
        boolean a6 = isValid(grid, r+1, c-2, n, exp+1);
        boolean a7 = isValid(grid, r-1, c-2, n, exp+1);
        boolean a8 = isValid(grid, r-2, c-1, n, exp+1);


        return a1||a2||a3||a4||a5||a6||a7||a8;

    }
    public boolean checkValidGrid(int[][] grid) {
       return isValid(grid, 0, 0, grid.length, 0);
    }
}