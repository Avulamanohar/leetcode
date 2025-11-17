class Solution {
    public int minLengthAfterRemovals(String s)
    {
        int n=s.length();
        int sum=0;
        int sr=0;
        
        for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='b')
                {
                    sr++;
                }
                else
                {
                    sum++;
                }
               
            }
        
        return Math.abs(sr-sum);
        
    }
}