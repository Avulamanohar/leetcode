class Solution {
    public int minPathSum(int[][] grid) 
{        int m=grid.length;
        int n=grid[0].length;
     int b[][]=new int[m][n];
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            b[i][j]=-1;
        }
     } b[0][0]=grid[0][0];
        for(int i=1;i<m;i++)
        {
            grid[i][0]+=grid[i-1][0];
            b[i][0]=grid[i][0];
        }
         for(int i=1;i<n;i++)
        {
            grid[0][i]+=grid[0][i-1];
                b[0][i]=grid[0][i];
        }
        if(m==1||n==1)
        {
            return grid[m-1][n-1];
        }
        return min(m,n,grid,b);
    }
    public int min(int m,int n,int a[][],int b[][])
    {
        if(b[m-1][n-1]!=-1)
        {
            return b[m-1][n-1];
        }

    a[m-1][n-1]+=Math.min(min(m-1,n,a,b),min(m,n-1,a,b));
    b[m-1][n-1]=a[m-1][n-1];
    return a[m-1][n-1];
    }
}