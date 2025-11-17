class Solution {
    public boolean kLengthApart(int[] nums, int k) 
    {
        int f=k;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                f++;
            }
            else
            {
                if(f<k)
                {
                    return false;
                }
                f=0;
            }
        }
        return true;
        
    }
}