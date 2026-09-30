class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1)
        return nums;

        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    void mergeSort(int nums[], int st, int end)
    {
        if(st>=end)
        {
            return;
        }
        int mid = st+(end-st)/2;
        mergeSort(nums, st, mid);
        mergeSort(nums, mid+1, end);

        merge2(nums, st, mid, end);
    }

    void merge2(int[] nums, int st, int mid, int end)
    {
        int i = st;
        int j = mid+1;
        int k =0;
        int t[] = new int[end-st+1];

        while(i<=mid && j<=end)
        {
            if(nums[i]<=nums[j])
            {
                t[k++] = nums[i++];
            }
            else
            t[k++] = nums[j++];
        }
        while(i<=mid)
        t[k++] = nums[i++];

        while(j<=end)
        t[k++] = nums[j++];

        for(int a =0; a<k; a++)
        {
            nums[a+st] = t[a];
        }
    }
}