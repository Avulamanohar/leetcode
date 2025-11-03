class Solution {
    public int findTargetSumWays(int[] nums, int target)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int dp[][]=new int[nums.length+1][2*sum+1];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<2*sum+1;j++)
            {
                dp[i][j]=-1;
            }
        }
return find(0,nums,target,dp,0,sum);
        
    }
    public int find(int ind,int nums[],int target,int dp[][],int sum,int total)
    {
        if(ind==nums.length)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;

        
        }
        if(dp[ind][sum+total]!=-1)
        {
            return dp[ind][sum+total];
        }
      
        int a=sum-nums[ind];
        int b=sum+nums[ind];
        int k=find(ind+1,nums,target,dp,a,total)+find(ind+1,nums,target,dp,b,total);
        return dp[ind][sum+total]=k;
    }
}