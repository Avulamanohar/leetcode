class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) 
    {
        int c=0;
        for(int i:nums)
        {
             if(i%2==0&&i<=threshold)
             {
                c++;
                break;
             }
        }
       
        for(int i=0;i<nums.length;i++)
        {if(nums[i]%2==1||nums[i]>threshold)
                {
                    continue;
                }
                
            for(int j=i+1;j<nums.length;j++)
            {
                
                if(nums[j]>threshold)
                {
                    break;
                }
                if(nums[j-1]%2==nums[j]%2)
                {
                    break;
                }
                c=Math.max(j-i+1,c);

            }
        }
        return c;
        
    }
}