class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int n=nums.length;
        int dp[][]=new int[n][2*sum+1];
        for(int r[]:dp)
        {
            Arrays.fill(r,-1);
        }
        return find(0,0,sum,nums,target,dp);
    }
    public int find(int i,int t,int sum,int a[],int target,int dp[][])
    {
        if(i==a.length)
        {
            if(target==t)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(dp[i][sum+t]!=-1)
        {
            return dp[i][sum+t];
        }
        int p=find(i+1,t+a[i],sum,a,target,dp);
        int n=find(i+1,t-a[i],sum,a,target,dp);
        return dp[i][sum+t]=p+n;

    }
}