class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        int c=0;
        int end = s.length()-1;

        for(int i = end; i>=0; i--)
        {
            if(Character.isWhitespace(s.charAt(i)))
            break;

            c++;
        }

        return c;
    }
}