class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
     {
        List<Integer> arr=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bot=m-1;
        int left=0;
        int right=n-1;
        int i,j;
        while(top<=bot&&left<=right)
        {
        for(i=left;i<=right;i++)
        {
           arr.add(matrix[top][i]);
        } 
        top++;
        for(i=top;i<=bot;i++)
        {
            arr.add(matrix[i][right]);
        }
        right--;
        if(top<=bot){
          for(i=right;i>=left;i--)
        {
            arr.add(matrix[bot][i]);
        }}
        
        bot--;
        if(right>=left)
        {
         for(i=bot;i>=top;i--)
        {
            arr.add(matrix[i][left]);
        }}
        left++;
        }
        return arr;
        
    }
}