class Solution {
    public void setZeroes(int[][] matrix)
    {
        int n=matrix[0].length;
        int m=matrix.length;
        boolean b[]=new boolean[m];
        boolean b1[]=new boolean[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    b[i]=true;
                    b1[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(b[i])
            {
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            if(b1[i])
            {
                for(int j=0;j<m;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
  
        
    }
}