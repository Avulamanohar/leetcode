class Solution {
    public boolean findRotation(int[][] mat, int[][] target)
    {
        
        int i,j;
        int n=mat.length;
       for(i=0;i<4;i++)
       {
        boolean b=hi(mat,target);
        if(b==true)
        {
            return true;
        }
       }
      
        return false;
    }
    public void Rotation(int[][] a)
    {
        int i,j,k;
        int n=a.length;
        int b[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
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
                a[i][j]=b[i][j];
            }
        }
    }
    public boolean hi(int mat[][],int target[][])
    {
           int i,j;
              Rotation(mat);
        int n=mat.length;
       
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }
      
        return true;
    }
}