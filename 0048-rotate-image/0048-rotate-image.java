class Solution {
    public void rotate(int[][] matrix)
    {
        int i,j,k;
        int m=matrix.length;
        int b[][]=new int[m][m];
        int n=m;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
           b[i][j]=matrix[j][i];
            }
        }
       
        for(i=0;i<n;i++)
        {
        j=0;
        k=n-1;
        while(j<k)
        {
            int temp=b[i][j];
            b[i][j]=b[i][k];
            b[i][k]=temp;
            j++;
            k--;
        }

        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                matrix[i][j]=b[i][j];
            }
        }
        
    }
}