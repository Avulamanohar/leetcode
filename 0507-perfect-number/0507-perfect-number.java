class Solution {
    public boolean checkPerfectNumber(int num) 
    {
        int i,j,k;
       int sum=0;

        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
               sum+=i; 
            }
        }
        boolean b=false;
        if(sum==num)
        {
            b=true;
        }
        return b;
    }
}