class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r)
    {
        int f=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            int sum=0;
            for(int j=i;j<nums.size();j++)
            {
                sum+=nums.get(j);
                if(j-i+1>r)
                {
                    break;
                }
                if(sum>0&&l<=j-i+1&&r>=j-i+1)
                {
                    f=Math.min(f,sum);
                }
            }
        }
        if(f==Integer.MAX_VALUE)
        {
            return -1;
        }
        return f;
        
    }
}