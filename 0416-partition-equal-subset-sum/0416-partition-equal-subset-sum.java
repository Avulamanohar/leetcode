class Solution {
    public boolean canPartition(int[] nums)
    {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];

        }
        if(sum%2==1)
        {
            return false;
        }
        int m=sum/2;
        Boolean dp[][]=new Boolean[n][m+1];
        return partition(0,nums,0,m,dp);
        
    }
    public boolean partition(int ind,int nums[],int sum,int m,Boolean dp[][])
    {
        if(sum==m)
        {
            return true;
        }
        if(ind==nums.length)
        {
            return sum==m;
        }
        if(dp[ind][sum]!=null)
        {
            return dp[ind][sum];
        }
        Boolean b=partition(ind+1,nums,sum,m,dp);
        Boolean c=false;
        if(m-sum>=nums[ind])
        {
            c=partition(ind+1,nums,sum+nums[ind],m,dp);
        }
        dp[ind][sum]=b||c;
        return dp[ind][sum];
    }
}