class Solution {
    public int[] intersect(int[] nums1, int[] nums2)
    {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        Map<Integer,Integer> map3=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(map1.containsKey(nums1[i]))
            {
                map1.put(nums1[i],map1.get(nums1[i])+1);
            }
            else
            {
                map1.put(nums1[i],1);

            }
        }
         for(int i=0;i<nums2.length;i++)
        {
            if(map2.containsKey(nums2[i]))
            {
                map2.put(nums2[i],map2.get(nums2[i])+1);
            }
            else
            {
                map2.put(nums2[i],1);

            }
        }

        List<Integer> lk=new ArrayList<>(map1.keySet());
        for(int i=0;i<lk.size();i++)
        {
            int a=lk.get(i);
            if(map1.containsKey(a)&&map2.containsKey(a))
            {
                map3.put(a,Math.min(map1.get(a),map2.get(a)));
            }
        }
        List<Integer> lf=new ArrayList<>(map3.keySet());
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<lf.size();i++)
        {
            for(int j=0;j<map3.get(lf.get(i));j++)
            {
                l.add(lf.get(i));
            }
        }
        int ar[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            ar[i]=l.get(i);
        }
        

return ar;
        
    }
}