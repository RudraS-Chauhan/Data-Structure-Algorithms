class Solution {
    public boolean judgeSquareSum(int c) {
        long f = 0;
        long s = (long) Math.sqrt(c);

        while(f<=s)
        {
            long sum = f*f+s*s;

            if(sum == c)
            {
                return true;
            }

            else if(sum<c)
            {
                f++;
            }
            else
            {
                s--;
            }
        }
        return false;
    }
}