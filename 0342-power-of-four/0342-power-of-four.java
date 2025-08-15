class Solution {
    public boolean isPowerOfFour(int n)
    {
        long m=n;
        if(m<=0)
        {
            return false;
        }
        if(m==1)
        {
            return true;
        }
        while(m>1)
        {
            if(m%4!=0)
            {
                return false;
            }
            m=m/4;
        }
        return true;
        
    }
}