class Solution {
    public boolean canPartition(int[] nums)
    {
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
       }
       if(sum%2!=0)
       {
        return false;
       }
       int n=nums.length;
       Boolean dp[][]=new Boolean[n][sum+1];
       return can(0,nums,sum/2,dp);
    }
    public boolean can(int i,int nums[],int sum,Boolean dp[][])
    {
        if(sum<0)
        {
            return false;
        }
        if(sum==0)
        {
            return true;
        }
        if(i==nums.length)
        {
            return false;
        }
        if(dp[i][sum]!=null)
        {
            return dp[i][sum];
        }
        return dp[i][sum]=can(i+1,nums,sum-nums[i],dp)||can(i+1,nums,sum,dp);
    }
}