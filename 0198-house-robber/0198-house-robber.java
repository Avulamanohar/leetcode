class Solution {
    public int rob(int[] nums) 
    {  int n=nums.length;
        int dp[]=new int[n];
         int j=0;
         if(n==1)
         {
            return nums[0];
         }
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
       
        dpr(n-1,nums,dp);
        return Math.max(dp[n-1],dp[n-2]);

    }
    public int dpr(int n,int nums[],int dp[])
    {
        if(n<0)
        {
            return 0;
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int a=nums[n]+dpr(n-2,nums,dp);
        int b=dpr(n-1,nums,dp);
      
          
         dp[n]=Math.max(a,b);
        
        return dp[n];

    }
}