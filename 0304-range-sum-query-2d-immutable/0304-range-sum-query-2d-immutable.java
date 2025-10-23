class NumMatrix {
    public int a[][];

    public NumMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        a=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
           {
            a[i][j]=matrix[i][j];
           }

        }
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                a[i][j]+=a[i][j-1];
            }
        }
          for(int j=0;j<n;j++)
        {
            for(int i=1;i<m;i++)
            {
                a[i][j]+=a[i-1][j];
            }
        }
     
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        int k=a[row2][col2];
        if(col1>0)
        {
            k-=a[row2][col1-1];
        }
        if(row1>0)
        {
            k-=a[row1-1][col2];
        }
        if(row1>0&&col1>0)
        {
            k+=a[row1-1][col1-1];
        }
        return k;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */