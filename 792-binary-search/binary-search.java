class Solution {
    public int search(int[] nums, int target) {
        int st = 0, end = nums.length;
        return bin(nums, target, 0, nums.length-1);
        
    }
    int bin(int[] nums, int target, int st, int end)
    {
        if(st<=end)
        {
            int mid = st + (end-st)/2;

            if(nums[mid] == target)
            return mid;

            else if(nums[mid]<target)
            {
                return bin(nums, target, mid+1, end);
            }
            else
            return bin(nums,target, st, mid-1);
        }
        return -1;
    }
}