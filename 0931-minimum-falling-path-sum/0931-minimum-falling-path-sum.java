class Solution {
    public int minFallingPathSum(int[][] matrix)
     {
        int m=matrix.length;
        int dp[][]=new int[m][m];
        for(int []row:dp)
        {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        int a=Integer.MAX_VALUE;
       
       for(int i=0;i<m;i++)
       {
        a=Math.min(a,min(0,i,m,matrix,dp));
       }
      
     
        return a;
        
    }
    public int min(int i,int j,int m,int g[][],int dp[][])
    {
        if(j<0||j>m-1)
        {
          return Integer.MAX_VALUE;
        }
        if(i==m)
        {
            return 0;
        }
        if(dp[i][j]!=Integer.MAX_VALUE)
         {
            return dp[i][j];
         }
        int a=min(i+1,j,m,g,dp);
         int b=Integer.MAX_VALUE;
       
       
        b=min(i+1,j+1,m,g,dp);
        
        int c=Integer.MAX_VALUE;
       
        c=min(i+1,j-1,m,g,dp);
        int k=Math.min(a,Math.min(b,c));
        if(k==Integer.MAX_VALUE)
        {
            return k;
        }
        return dp[i][j] =k+g[i][j];

    }
}