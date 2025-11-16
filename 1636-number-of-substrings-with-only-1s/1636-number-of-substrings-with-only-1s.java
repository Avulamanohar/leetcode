class Solution {
    public int numSub(String s) 
    {
        long pre=(long)1e9+7;
        long c=0;
        long sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                c+=(sum)*(sum+1)/2;
                c%=pre;
                sum=0;
            }
            else
            {
                sum++;
            }

        }
         c+=(sum)*(sum+1)/2;
                c%=pre;

         return (int)c%(int)pre;
        
    }
}