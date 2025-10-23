class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int b=0;
        int p=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                b++;
            }
            else
             {
                p*=nums[i];
             }

        }
        if(b>1)
        {
            for(int i=0;i<n;i++)
            {
                nums[i]=0;
            }
        }
       else if(b==1)
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                {
                    nums[i]=p;
                }
                else
                {
                    nums[i]=0;
                }
            }
        }
            else
            {
                for(int i=0;i<n;i++)
                {
                    nums[i]=p/nums[i];
                }
            }

        
        return nums;
        
    }
}