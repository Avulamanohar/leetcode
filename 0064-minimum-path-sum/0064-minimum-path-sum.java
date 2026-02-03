class Solution {
    public int minPathSum(int[][] grid)
    {
      
        int m=grid.length;
        int n=grid[0].length;
          int dp[][]=new int[m][n];
          for(int[] a:dp)
          {
            Arrays.fill(a,-1);
          }
        return sum(0,0,m,n,grid,dp);

    }
    public int sum(int i,int j,int m,int n,int g[][],int dp[][])

    {
        if(i==m||j==n)
        {
            return Integer.MAX_VALUE;
        }
        if(i==m-1&&j==n-1)
        {
            return g[i][j];
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int a=sum(i+1,j,m,n,g,dp);
        int b=sum(i,j+1,m,n,g,dp);
        return dp[i][j]=Math.min(a,b)+g[i][j];
    }
}