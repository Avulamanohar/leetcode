class Solution {
    public int findLHS(int[] nums) 
    {
        Arrays.sort(nums);
        int c=0;
        int k=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {

            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }

            if(map.containsKey(nums[i]-1))
            
            {
                
               c=Math.abs(i-map.get(nums[i]-1)+1);
            }
           k=Math.max(c,k);
        }
        return k;
        
    }
}