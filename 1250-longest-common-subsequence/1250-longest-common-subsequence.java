class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++)
        {
            for(int j=0;j<text2.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        return longest(0,0,text1,text2,dp);
    }
    public int longest(int ind1,int ind2,String s1,String s2,int dp[][])
    {
        if(ind1==s1.length()||ind2==s2.length())
        {
            return 0;
        }
        if(s1.charAt(ind1)==s2.charAt(ind2))
        {
            return 1+longest(ind1+1,ind2+1,s1,s2,dp);
        }
        if(dp[ind1][ind2]!=-1)
        {return dp[ind1][ind2];}
        return dp[ind1][ind2]=Math.max(longest(ind1+1,ind2,s1,s2,dp),longest(ind1,ind2+1,s1,s2,dp));
    }
}