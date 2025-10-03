class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<text1.length()+1;i++)
        {
            for(int j=0;j<text2.length()+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        return sub(0,0,text1,text2,dp);
    }
    public int sub(int ind1,int ind2,String s1,String s2,int dp[][])
    {
        if(ind1==s1.length()||ind2==s2.length())
        {
            return 0;
        }
       
        if(s1.charAt(ind1)==s2.charAt(ind2))
        {
            return 1+sub(ind1+1,ind2+1,s1,s2,dp);
        }
         if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        return dp[ind1][ind2]=Math.max(sub(ind1+1,ind2,s1,s2,dp),sub(ind1,ind2+1,s1,s2,dp));
    }
}