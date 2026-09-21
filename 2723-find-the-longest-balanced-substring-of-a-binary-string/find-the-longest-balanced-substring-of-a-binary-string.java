class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int i = 0;
        int mlen=0;
        int n = s.length();

        while(i<n)
        {
            int zero = 0;
            int ones = 0;

            while(i<n && s.charAt(i)=='0')
            {
                zero++;
                i++;
            }

            while(i<n && s.charAt(i)=='1')
            {
                ones++;
                i++;
            }

            int clen = 2*Math.min(zero, ones);
            mlen = (int)Math.max(mlen, clen);
        }
        return mlen;
    }
}