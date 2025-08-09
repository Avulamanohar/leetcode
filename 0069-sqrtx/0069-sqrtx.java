class Solution {
    public int mySqrt(int x)
     {   if(x==0)
     {
        return 0;
     }
     if(x<=2)
     {
        return 1;
     }  long y=(long)x;
        long i=1;
        long j=x/2;
        while(i<=j)
        {
            long mid=i+(j-i)/2;
            long f=(mid*mid);
            if(f<y)
            {
                i=mid+1;
            }
             if(f>y)
            {
                j=mid-1;
            }
            if(f==y)
            {
                 j=mid;
                 break;
            }
          
        }
        return (int)j;
        
    }
}