class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pr = strs[0];
        for(int i =1; i<strs.length; i++)
        {
            String cword = strs[i];
            int j =0;

            while(j<pr.length() && j<cword.length())
            {
                if(pr.charAt(j) == cword.charAt(j))
                j++;

                else
                break;
            }

            pr = pr.substring(0, j);

            if(pr.equals(""))
            return "";
        }
        return pr;

    }
}