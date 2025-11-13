class Solution {
    public int maxOperations(String s)
     {
        int n=s.length();
        int c=0;
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
            {
                c++;
                while(i>-1&&s.charAt(i)=='0')
                {
                    i--;
                }
            }
            if(i>-1&&s.charAt(i)=='1')
            {
                k+=c;
            }
        }
        return k;
        
    }
}