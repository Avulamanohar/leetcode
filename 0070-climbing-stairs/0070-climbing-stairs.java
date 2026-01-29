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

    public int climb(int i,int n,int dp[])
    {
        if(i>n)
        {
            return 0;
        }
        if(i==n)
        {
            return 1;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
      int a=climb(i+1,n,dp);
      int b=climb(i+2,n,dp);
      return dp[i]=a+b;

    }}