class Solution {
    public int countEven(int num) {
     int c = 0;
     int d=0;

     for(int i =1 ; i<=num; i++)   
     {
        int s=0;
        int n=i;
        while(n>0)
        {
            d=n%10;
            s=s+d;
            n=n/10;

        }
        if(s%2==0)
        {
            c++;
        }
     }
    return c; 


    }
};