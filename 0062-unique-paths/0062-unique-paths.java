class Solution {
    public int uniquePaths(int m, int n) 
    {
        int a[][]=new int[m][n];
       for(int i=0;i<m;i++)
       {
        a[i][0]=1;
       }
       for(int i=0;i<n;i++)
       {
        a[0][i]=1;
       }
       return path(m,n,a);
        
    }
    public int path(int m,int n,int a[][])
    {
        if(a[m-1][n-1]!=0)
        {
            return a[m-1][n-1];
        }
        a[m-1][n-1]=path(m,n-1,a)+path(m-1,n,a);
        return a[m-1][n-1];
    }
}