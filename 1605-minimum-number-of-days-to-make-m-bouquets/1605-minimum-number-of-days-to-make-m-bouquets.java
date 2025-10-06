class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n)
        {
            return -1;
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
     
        for(int i=0;i<n;i++)
        {
            a=Math.min(a,bloomDay[i]);
            b=Math.max(b,bloomDay[i]);
        }
        int c=b;
        while(a<=b)
        {
            int mid=a+(b-a)/2;
            if(minD(m,k,bloomDay,mid))
            {
                b=mid-1;
            }
            else
              {
                a=mid+1;
              }
        }
        if(a>c)
        {
            return -1;
        }
      
        return a;

        
    }
    public boolean minD(int m,int k,int a[],int g)
    {
        int f=0;
        int p=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=g)
            {
                f++;
                if(f==k)
                {
                    p++;
                    f=0;
                }
            }
            else
            {
                f=0;
            }
        }
        if(p<m)
        {
            return false;
        }
        return true;
    }
}