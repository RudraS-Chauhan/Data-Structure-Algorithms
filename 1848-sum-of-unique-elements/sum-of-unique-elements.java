class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int counts[] = new int[101];
        for(int i =0; i<nums.length; i++)
        {
            int value = nums[i];
            counts[value]++;
        }
        for(int i =0; i<=100; i++)
        {
            if(counts[i] == 1)
            s+=i;
        }
        return s;
    }
}