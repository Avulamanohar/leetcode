class Solution {
    public boolean checkSubarraySum(int[] nums, int k)
     {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
           nums[i]+=nums[i-1];
        }
        map.put(0,-1);
        for(int i=0;i<n;i++)
        {
            int f=nums[i]%k;
            if(map.containsKey(f))
            {
                if(i-map.get(f)>1)
                {
                    return true;
                }
            }
            else
            {
                map.put(f,i);
            }

        }
        return false;
        
    }
}