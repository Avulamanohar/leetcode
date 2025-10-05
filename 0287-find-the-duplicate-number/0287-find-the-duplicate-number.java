class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(!map.containsKey(a))
            {
                map.put(a,1);
            }
            else
            {
                map.put(a,map.get(a)+1);
            }
        }
        List<Integer> arr=new ArrayList<>(map.keySet());
        for(int i=0;i<arr.size();i++)
        {
            int a=arr.get(i);
            if(map.get(a)>1)
            {
                return a;
            }
        }
        return -1;
    }
}