class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int i,j;
        int n=nums.length;
        int count=1;
        int a=nums[0];
        if(n>2&&nums[0]!=nums[1])
        {
            return a;
        }
        for(i=1;i<n-1;i++)
        {
            if(nums[i-1]!=nums[i]&&nums[i]!=nums[i+1])
            {
                return nums[i];
            }

        }
        if(n>2&&nums[n-2]!=nums[n-1])
        {
            a=nums[n-1];
        }

      
        return a;
        
    }
}