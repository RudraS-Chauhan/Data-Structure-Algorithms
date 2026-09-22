class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0;
        int p = 1;
        int d = 0;

        while(n>0)
        {
            d = n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return p-s;
    }
}