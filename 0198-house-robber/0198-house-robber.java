class Solution {
    public int rob(int[] nums) 
    {  int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        if(n==1)
        {
            return dp[0];
        }
        dp[1]=nums[1];
        int b=0;
        for(int i=2;i<n;i++)
        {
            
            int a=0;
            for(int j=0;j<i-1;j++)
            {
             a=Math.max(nums[i]+dp[j],a);
            
            }
            dp[i]=a;
             b=Math.max(a,b);
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}