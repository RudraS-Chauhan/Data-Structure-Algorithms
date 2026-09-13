class Solution {
    public void moveZeroes(int[] nums) {
      int n = nums.length;

      int[] t = new int[n];
      int tindex = 0;
      for(int i =0; i<n; i++)  
      {
        if(nums[i] != 0)
        {
            t[tindex] = nums[i];
            tindex++;
        }
      }

      for(int i =0; i<n; i++)
      {
       nums[i] = t[i];
      }
    }
}