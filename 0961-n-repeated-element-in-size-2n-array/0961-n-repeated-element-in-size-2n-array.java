class Solution {
    public int repeatedNTimes(int[] nums)
    {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return nums[i];
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        return -1;
    }
}