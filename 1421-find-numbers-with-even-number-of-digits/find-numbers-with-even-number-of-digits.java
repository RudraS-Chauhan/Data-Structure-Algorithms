class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        int d = 0;
        for(int i =0; i<nums.length; i++)
        {
            int cdigits = 0;
            while(nums[i]>0)
            {
                d = nums[i]%10;
                cdigits++;
                nums[i] = nums[i] / 10;
            }
            if(cdigits%2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}