class Solution {
    public int coinChange(int[] coins, int amount)
     { 
        Arrays.sort(coins);
        
        int n=coins.length;
        int l=0;
        int m=n-1;
        while(l<=m)
        {
            int temp=coins[l];
            coins[l]=coins[m];
            coins[m]=temp;
            l++;
            m--;
        }
        int dp[][]=new int[n][amount+1]; 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<amount+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        int g=part(0,0,amount,coins,dp);
        return g>=1e9?-1:g;
    }
    public int part(int ind,int sum,int k,int a[],int dp[][])
    {
        if(sum==k)
        {
        return 0;
        }
        if(ind==a.length)
        {return (int)1e9;}
        if(dp[ind][sum]!=-1)
        {
            return dp[ind][sum];
        }
        int ar=part(ind+1,sum,k,a,dp);
        int br=(int)1e9;
        if(k-sum>=a[ind])
        {
             int res=part(ind,sum+a[ind],k,a,dp);
             if(res!=  (int)1e9)
             {
                br=1+res;
             }
        }
        dp[ind][sum]=Math.min(ar,br);
        return dp[ind][sum];
    }
}