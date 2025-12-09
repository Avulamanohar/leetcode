class Solution {
    public int specialTriplets(int[] nums) 
    {  int n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(2*nums[i]))
            {
                a[i]=map.get(2*nums[i]);
            }
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
         for(int i=n-1;i>=0;i--)
        {
            if(map1.containsKey(2*nums[i]))
            {
                b[i]=map1.get(2*nums[i]);
            }
            if(map1.containsKey(nums[i]))
            {
                map1.put(nums[i],map1.get(nums[i])+1);
            }
            else
            {
                map1.put(nums[i],1);
            }
        }
        long c=0;
        int d=(int)(1e9+7);
        for(int i=0;i<n;i++)
        {
c=(c+(long)a[i]*b[i])%d;

        }
        return (int)c;
        
    }
}