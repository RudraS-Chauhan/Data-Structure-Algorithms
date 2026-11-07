class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        int max = 0;
        for(int i =0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                cons++;
                if(cons>max)
                {
                    max = cons;
                }
            }
            else
            cons = 0;
        }
        return max;
    }
}