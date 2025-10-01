class Solution {
    public boolean isSubsequence(String s, String t)
    {  int n=s.length();
    int m=t.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=-1;
            }
        }
        int a=longest(0,0,s,t,dp);
        if(a==n)
        {
            return true;
        }
        return false;
    }
public int longest(int i,int j,String s,String t,int dp[][])
{
    if(i==s.length()||j==t.length())
    {
        return 0;
    }
    if(dp[i][j]!=-1)
    {
        return dp[i][j];
    }
    if(s.charAt(i)==t.charAt(j))
    {
        return 1+longest(i+1,j+1,s,t,dp);
    }
    return dp[i][j]=Math.max(longest(i+1,j,s,t,dp),longest(i,j+1,s,t,dp));
}
}