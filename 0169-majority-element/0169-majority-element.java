class Solution {
    public int majorityElement(int[] nums)
    { 
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        List<Integer> arr=new ArrayList<>(map.keySet());
        for(int i=0;i<arr.size();i++)
        {
            if(map.get(arr.get(i))>n/2)
            {
                return arr.get(i);
            }
        }
        return 0;
    }
}