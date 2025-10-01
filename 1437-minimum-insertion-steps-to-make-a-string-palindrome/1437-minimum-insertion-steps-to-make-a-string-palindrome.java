class Solution {
    public int minInsertions(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {dp[i][j]=-1;}
        }
      return longest(0,s.length()-1,s,dp);  
    }
    public int longest(int ind1,int ind2,String s,int dp[][])
    {
        if(ind1>ind2)
        {
            return 0;
        }
        if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        if(s.charAt(ind1)==s.charAt(ind2))
        {
            return longest(ind1+1,ind2-1,s,dp);
        }
        int a=1+longest(ind1+1,ind2,s,dp);
        int b=1+longest(ind1,ind2-1,s,dp);
        return dp[ind1][ind2]=Math.min(a,b);
    }
}