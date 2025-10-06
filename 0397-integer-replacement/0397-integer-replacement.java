class Solution {
    public int integerReplacement(int n)
    {
        Map<Long,Integer> hm=new HashMap<>();
    
        return dyp((long)n,hm);
        
    }
    public int dyp(long n,Map<Long,Integer> hm)
    {
        if(n==1)
        {
            return 0;
        }
        if(hm.containsKey(n))
        {
            return hm.get(n);
        }
        int a;
        if(n%2==0)
        {
            a=1+dyp(n/2,hm);
        }
        else
        {
            int l=1+dyp(n+1,hm);
            int j=1+dyp(n-1,hm);
            a=Math.min(l,j);
        }
        hm.put(n,a);
        return a;
    }
}