class Solution {
    public int longestPalindromeSubseq(String s)
    { 
      
          int dp[][]=new int[s.length()][s.length()];
          for(int i=0;i<s.length();i++)
          {
            for(int j=0;j<s.length();j++)
            {
                dp[i][j]=-1;
            }
          }
          return longest(0,s.length()-1,s,dp);

    }
  public int longest(int i,int j,String s,int dp[][])
  {
      if(i>j)
      {
        return 0;
      }
      if(i==j)
      {return 1;}
      if(dp[i][j]!=-1)
      {
        return dp[i][j];
      }
      if(s.charAt(i)==s.charAt(j))
      {
        return dp[i][j]=2+longest(i+1,j-1,s,dp);
      }
      return dp[i][j]=Math.max(longest(i+1,j,s,dp),longest(i,j-1,s,dp));
  }
   
}