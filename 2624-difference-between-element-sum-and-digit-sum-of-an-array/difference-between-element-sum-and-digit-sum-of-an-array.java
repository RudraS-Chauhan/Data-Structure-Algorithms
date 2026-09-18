class Solution {
    public int differenceOfSum(int[] nums) {
        int s1 =0;
        int s2=0;
        int d = 0;
        for(int  i =0; i<nums.length; i++)
        {
            s1+=nums[i];
        }

        for(int  i =0; i<nums.length; i++)
        {
            while(nums[i]>0)
                {
                d = nums[i]%10;
                s2+=d;
                nums[i]/=10;
                }
        }

        return s1-s2;
    }
}