class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
       for(int i = 0; i<stones.length(); i++) 
       {
        char current = stones.charAt(i);

        if(jewels.indexOf(current) != -1)
        {
            c++;
        }
       }
       return c;
    }
}