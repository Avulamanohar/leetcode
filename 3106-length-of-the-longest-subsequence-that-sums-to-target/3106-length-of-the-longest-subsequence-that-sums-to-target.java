class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) 
    {
       int a[]=new int[nums.size()];
       for(int i=0;i<a.length;i++)
       {
        a[i]=nums.get(i);
       } 
       int dp[][]=new int[a.length][target+1];
       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<target+1;j++)
        {
            dp[i][j]=-1;
        }
       }
       int h=hi(0,0,target,a,dp);
       if(h<0)
       {return -1;}
       return h;
    }
     
    public int hi(int ind,int sum,int k,int a[],int dp[][])
    {
        if(sum==k)
        {
            return 0;

        }
        if(ind==a.length)
        {
            return Integer.MIN_VALUE;
        }
        if(dp[ind][sum]!=-1)
        {
            return dp[ind][sum];
        }
        int sk=hi(ind+1,sum,k,a,dp);
        int take=Integer.MIN_VALUE;
        if(k-sum>=a[ind])
        { int t=hi(ind+1,sum+a[ind],k,a,dp);
            if(t!=Integer.MIN_VALUE)
            {
            take=1+t;
            }
        }
        dp[ind][sum]=Math.max(take,sk);
        return dp[ind][sum];
    }
}