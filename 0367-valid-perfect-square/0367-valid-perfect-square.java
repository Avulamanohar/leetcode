class Solution {
    public boolean isPerfectSquare(int num) 
    {   if(num==1)
    {
        return true;
    }
    if(num==2)
    {
        return false;
    }
        long x=(long)num;
        long i=1;
        long j=x/2;
        while(i<=j)
        {   long mid=i+(j-i)/2;
            long h=mid*mid;
            if(h<num)
            {
            i=mid+1;
            }
           else if(h>num)
            {
                j=mid-1;
            }
            else
            {
                return true;
            }
        }  
        return false;      
    }
}