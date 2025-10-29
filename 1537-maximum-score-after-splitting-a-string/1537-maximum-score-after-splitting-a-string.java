class Solution {
    public int maxScore(String s) 
    {
        int a[]=new int[s.length()];
        if(s.charAt(0)=='0')
        {
            a[0]=1;
        }
        for(int i=1;i<s.length();i++)
        {
            a[i]=a[i-1];
             if(s.charAt(i)=='0')
             {
                a[i]++;
             }
        }
        int n=s.length();
        int b=n-a[n-1];
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            int d=a[i];
            d+=b-(i+1-a[i]);
            c=Math.max(d,c);
        }
        return c;
        
    }
}