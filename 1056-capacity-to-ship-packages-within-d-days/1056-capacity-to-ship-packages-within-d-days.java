class Solution {
    public int shipWithinDays(int[] weights, int days)
    {
        int a=0;
        int b=0;
        for(int i:weights)
        {
            a=Math.max(i,a);
            b+=i;
        }
        while(a<=b)
        {
            int mid=a+(b-a)/2;
            if(ship(weights,mid,days))
            {
                b=mid-1;
            }
            else
            {
                a=mid+1;
            }
        }
        return a;
        
    }
    public boolean ship(int a[],int mid,int d)
    {
        int f=0;
        int k=1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>mid)
            {
                return false;
            }
            else if(f+a[i]<=mid)
            {
                f+=a[i];
            }
            else
            {
                k++;
                if(k>d)
                {
                    return false;
                }
                f=a[i];
            }
           
        }
         if(k>d)
            {
                return false;
            }
            return true;
    }
}