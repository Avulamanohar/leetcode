class Solution {
    public int MOD=(int)1e9+7;
    public int nthMagicalNumber(int n, int a, int b) 
    {
        long i=1;
        long j=(long)1e18;
        long l=(1L*a*b)/gcd(a,b);
        long ans=-1;
        while(i<=j)
        {
            long mid=i+(j-i)/2;
            long k=0;
            k+=mid/a;
            k+=mid/b;
       
                k-=mid/l;
            
            if(k<(long)n)
            {
                i=mid+1;
            }
            else
            {
                ans=mid;
                j=mid-1;
            }
        }
        return (int)(ans%MOD);
    }
    public int gcd(int i,int j)
    {
     
        while(j!=0)
        {
           int temp=j;
           j=i%j;
           i=temp;

        }
        return i;

    }
}