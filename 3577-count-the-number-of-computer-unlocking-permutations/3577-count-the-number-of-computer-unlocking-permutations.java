class Solution {
    public int countPermutations(int[] complexity)
    {
        long preci=(long)1e9+7;
        Map<Integer,Integer> map=new HashMap<>();
        int f=Integer.MAX_VALUE;
        for(int i=0;i<complexity.length;i++)
        { int a=complexity[i];
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
            f=Math.min(a,f);
        }
        
        List<Integer> arr=new ArrayList<>(map.keySet());
        if(map.get(f)>1||f!=complexity[0])
        {
            return 0;
        }
        int p=(int)1e9+7;

        int n=complexity.length;
        long g=per(n-1);
       
return (int)g;

        
    }
    public long per(int n)
    { int p=(int)1e9+7;
       if(n<2)
       {
        return 1;
       }
       long k=1;
       for(int i=2;i<=n;i++)
       {
       k=(k*i)%p;
       }
        return k;

        
    }
}