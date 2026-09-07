class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[] = new int[2];

        for(int i =0; i<m; i++)
        {
            int one = 0;
            for(int val : mat[i])
            {
                one+=val;
            }
            if(one>ans[1])
            {
                ans[0] = i;
                ans[1] = one;
            }
        }
        return ans;
    }
}