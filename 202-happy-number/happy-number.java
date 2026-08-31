class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4)
        {
            int d = 0;
            int s = 0;
                while(n>0)
                {
                    d = n%10;
                    s = s+(int)Math.pow(d,2);
                    n = n/10;
                }
                n=s;
        }
        if(n==1)
        return true;

        else
        return false;

    }
}