class Solution {
    public int smallestIndex(int[] nums) {
        int d = 0;
        for(int i = 0; i<nums.length; i++)
        {
            int s = 0;
            int t = nums[i];
            while(t>0)
            {
                d = t%10;
                s += d;
                t/=10;
            }
            if(s == i)
            return i;
        }
        return -1;
    }
}