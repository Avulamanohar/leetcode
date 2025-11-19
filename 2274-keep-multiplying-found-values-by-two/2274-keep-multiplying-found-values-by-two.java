class Solution {
    public int findFinalValue(int[] nums, int original)
     {
        Arrays.sort(nums);
        int i=0;
        int k=original;
        while(i<nums.length)
        {
            if(k<nums[i])
            {
                return k;
            }
            else if(k==nums[i])
            {
                k=2*k;
            }
            i++;
        }
        return k;
        

    }
}