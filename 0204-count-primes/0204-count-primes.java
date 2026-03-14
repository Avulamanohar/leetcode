class Solution {
    public int countPrimes(int n)
    {
        int c=0;
        boolean b[]=new boolean[n+1];
        if(n<2)
        {
            return 0;
        }
        for(int i=2;i*i<n;i++)
        {
            if(!b[i])
            {
              
            for(int j=i*i;j<n;j+=i)
            {
                
                    b[j]=true;
                

            }}
        }
        
        for(int i=2;i<n;i++)
        {
            if(!b[i])
            {
                c++;
            }
        }
        return c;
        
    }
}