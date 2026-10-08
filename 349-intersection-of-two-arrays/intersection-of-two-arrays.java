class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);

       int m = nums1.length;
       int n = nums2.length;

       int s = (int)Math.min(m, n);
       int t[] = new int[s];

       int i =0;
       int j =0;
       int k = 0;

       while(i<m && j<n)
       {
        if (nums1[i] < nums2[j])
            i++;
        else if (nums1[i] > nums2[j]) 
            j++;
        
        else
        {
            if(k==0 || t[k-1] != nums1[i])
            {
                t[k] = nums1[i];
                k++;
            }
            i++;
            j++;
        }
       }
       return Arrays.copyOf(t, k);
    }
}