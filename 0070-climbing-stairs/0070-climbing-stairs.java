class Solution {
    public int climbStairs(int n) 
    {
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        }
        dp[0]=1;
        dp[1]=2;
climb(n,dp);
return dp[n-1];
        
    }
    public int climb(int n,int a[])
    {
        if(a[n-1]!=-1)
        {
            return a[n-1];
        }
        a[n-1]=climb(n-1,a)+climb(n-2,a);
        return a[n-1];
    }
}