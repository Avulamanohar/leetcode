class Solution {
    public int maxDepth(String s) 
    {
        int n=s.length();
        int a=0;
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                a++;
            }
            else if(s.charAt(i)==')')
            {
                a--;
            }
            m=Math.max(a,m);
        }
        return m;
        
    }
}