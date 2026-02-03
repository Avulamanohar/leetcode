class Solution {
    public int climbStairs(int n) 
    {
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
     
     return climb(0,n,dp);
    }
    public int climb(int n,int a,int dp[])
    {
       if(n==a)
       {
        return 1;
       } 
       if(n>a)
       {
        return 0;
       }
       if(dp[n]!=-1)
       {
        return dp[n];
       }
       return dp[n]=climb(n+1,a,dp)+climb(n+2,a,dp);
    }
}

   