class Solution {
    public int minimumRecolors(String blocks, int k)
    {
        int n=blocks.length();
        int m=101;
        int c=0;
        String s=blocks;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='W')
            {
                c++;
            }
        }
        m=Math.min(c,m);
        for(int i=k;i<n;i++)
        {
            if(s.charAt(i)=='W')
            {
                c++;
            }
            if(s.charAt(i-k)=='W')
            {
                c--;
            }
        m=Math.min(c,m);

        }
        return m;
        
    }
}