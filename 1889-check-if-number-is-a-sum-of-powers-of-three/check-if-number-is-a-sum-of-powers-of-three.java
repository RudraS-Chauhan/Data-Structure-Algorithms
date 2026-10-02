class Solution {
    public boolean checkPowersOfThree(int n) {
        int p = 0;
        int s = 0;
        while(n>0)
        {
            if(n%3 == 2)
            {
                return false;
            }
            n/=3;
        }

        return true;
    }
}