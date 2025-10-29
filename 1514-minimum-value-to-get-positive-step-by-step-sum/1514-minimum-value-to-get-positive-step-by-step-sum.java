class Solution {
    public int minStartValue(int[] nums) 
    { int a=nums[0];
        for(int i=1;i<nums.length;i++)
        {   
            nums[i]+=nums[i-1];
             a=Math.min(nums[i],a);
        }
        if(a>0)
        {
            return 1;
        }
        return Math.abs(a)+1;
        
    }
}