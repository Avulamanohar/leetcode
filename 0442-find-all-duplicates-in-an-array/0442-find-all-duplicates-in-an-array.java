class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {   int a=nums[i];
            if(hm.containsKey(nums[i]))
            { 
                hm.put(a,hm.get(a)+1);
            }
            else
            {
                hm.put(a,1);
            }
        }
        Set<Integer> hs=hm.keySet();
        List<Integer> arr=new ArrayList<>(hs);
        List<Integer> arr1=new ArrayList<>();


        for(int i=0;i<arr.size();i++)
        {
            if(hm.get(arr.get(i))==2)
            {arr1.add(arr.get(i));
            }
        }
return arr1;
        
    }
}