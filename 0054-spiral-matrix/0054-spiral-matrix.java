class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
     {
       
       int m=matrix.length;
       int n=matrix[0].length;
       int t=0;
       int l=0;
       int r=n-1;
       int b=m-1;
       List<Integer> arr=new ArrayList<>();
       while(l<=r&&t<=b)
       {
           for(int i=l;i<=r;i++)
           {
            arr.add(matrix[t][i]);
           }
           t++;
           for(int i=t;i<=b;i++)
           {
            arr.add(matrix[i][r]);
           }
           r--;
           
           if(t<=b) 
           {
           for(int i=r;i>=l;i--)
           {
            arr.add(matrix[b][i]);

           }}
           b--;
           
           
           if(l<=r)
           {
           
           for(int i=b;i>=t;i--)
           {
            arr.add(matrix[i][l]);

           }}
           l++;
           
       }
       return arr;
    }
}