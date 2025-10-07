class Solution {
    public int findDuplicate(int[] nums) {
        boolean b[]=new boolean[nums.length];
        for(int i=0;i<b.length;i++)
        {
            if(!b[nums[i]])
            {
              b[nums[i]]=true;
            }
            else
            {
              return  nums[i];
            }
        }
        return -1;
       
}}