class Solution {
    public void solu(char[] s, int l, int r)
    {
        if(l>=r)
        return;
        char t = s[l];
        s[l] = s[r];
        s[r] = t;

        solu(s, l+1, r-1);
    }
    public void reverseString(char[] s) {
        solu(s, 0, s.length-1);

     /*int left = 0;
     int right = s.length-1;

     while(left<right)           
     {
        char t = s[left];
        s[left] = s[right];
        s[s.length-1-left] = t;

        left++;
        right--;
     }*/
    }
}