class Solution {
    public int candy(int[] ratings)
     {  int i,j;
       int n=ratings.length;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
         a[i]=1;   
        }
        for(i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                a[i]=a[i-1]+1;
            }
        }
        for(i=n-2;i>=0;i--)
        {
            if(ratings[i+1]<ratings[i])
            {
                a[i]=Math.max(a[i+1]+1,a[i]);
            }
        }
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
}