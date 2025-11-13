class Solution {
    public double findMaxAverage(int[] nums, int k)
    {
        double s=0;
        for(int i=0;i<k;i++)
        {
            s+=(double)nums[i];


        }
                  double  c=s/k;
        for(int i=k;i<nums.length;i++)
        {
            s-=(double)(nums[i-k]);
            s+=(double)nums[i];
            c=Math.max(c,s/k);


        }
        return c;
        
    }
}