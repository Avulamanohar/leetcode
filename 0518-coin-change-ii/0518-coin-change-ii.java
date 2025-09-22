class Solution {
    public int change(int amount, int[] coins)
     {
     int dp[][]=new int[coins.length][amount+1];
     for(int i=0;i<coins.length;i++)
     {
        for(int j=0;j<amount+1;j++)
        {
            dp[i][j]=-1;
        }
     }
     int a[]=new int[1];
   return  ch(0,0,amount,coins,dp,a);
     
        
    }
    public int ch(int ind,int sum,int k,int a[],int dp[][],int ar[])
    {
        if(sum==k)
        { 
            return 1;
        }
        if(ind==a.length)
        {
            return 0;
        }
        if(dp[ind][sum]!=-1)
        {
return dp[ind][sum];
        }
    
        int take=ch(ind+1,sum,k,a,dp,ar);
      
        int not=0;
        if(k-sum>=a[ind])
        {
             not=ch(ind,sum+a[ind],k,a,dp,ar);
         
        }
        
            dp[ind][sum]=not+take;
        
       
      
return dp[ind][sum];
    }
}