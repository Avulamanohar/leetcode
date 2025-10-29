class Solution {
    public int smallestNumber(int n)
    {
        int c=1;
       while(n!=1)
       {
            n=n/2;
            c*=2;
       }
       c*=2;
       return c-1;
        
    }
}