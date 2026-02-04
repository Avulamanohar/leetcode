class Solution {
    public int change(int amount, int[] coins)
     {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
         for(int r[]:dp)
         {
          Arrays.fill(r,-1);
         }
    return coin(0,amount,coins,dp);
    }
    public int coin(int i,int k,int coins[],int dp[][])
    {
        if(k<0)
        {
            return 0;
        }
        if(i==coins.length)
        {
            if(k==0)
            {
                return 1;
            }
            return 0;
        }
        if(dp[i][k]!=-1)
        {
            return dp[i][k];
        }
      
        return dp[i][k]=coin(i,k-coins[i],coins,dp)+coin(i+1,k,coins,dp);
    }
}