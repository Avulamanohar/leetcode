class Solution {
    public int maxLength(int[] nums) 
    {  int n=nums.length;
       int k=0;
        for(int i=0;i<n-1;i++)
        {
            int p=nums[i];
            int g=nums[i];
            int l=nums[i];
         for(int j=i+1;j<n;j++)
         {
            g=gcd(g,nums[j]);
            p*=nums[j];
            l=lcm(l,nums[j]);
            if(p==g*l)
            {
                k=Math.max(k,j-i+1);
            }
         }
         
        }
        return k;
        

    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;

    }
    public int lcm(int a,int b)
    {
        return a/gcd(a,b)*b;
    }
}