class Solution {
    public int totalMoney(int n) {
        
        int total = 0;
        int first_day=1;

        while(n>0)
        {
            for(int d = 0; d<7 && n>0; d++)
            {
                total += (first_day + d);
                n--;
            }
            
            first_day++;
        }
        return total;
    }
}