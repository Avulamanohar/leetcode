class Solution {
    public int[][] generateMatrix(int n)
    {
        List<Integer> arr=new ArrayList<>();
        int a[][]=new int[n][n];
        int i,j;
        int b=n*n;
        for(i=1;i<=b;i++)
        {
            arr.add(i);
        }
        int top=0;
        int bot=n-1;
        int left=0;
        int right=n-1;
        int k=0;
        while(top<=bot&&left<=right)
        {
           for(i=left;i<=right;i++)
           {
            a[top][i]=arr.get(k);
            k++;
           }
           top++;
           for(i=top;i<=bot;i++)
           {
            a[i][right]=arr.get(k);
            k++;
           }
           right--;
           if(top<=bot)
           {
           for(i=right;i>=left;i--)
           {
            a[bot][i]=arr.get(k);
            k++;
           }
           }
           bot--;
           if(right>=left)
           {
            for(i=bot;i>=top;i--)
            {
                a[i][left]=arr.get(k);
                k++;
            }
            
           }
           left++;
        }
        return a;
        
    }
}