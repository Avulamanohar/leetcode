class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        for(int i:nums1)
        {
            hs.add(i);
        }
        for(int i:nums2)
        {
            hs1.add(i);
        }
        hs.retainAll(hs1);
        List<Integer> arr=new ArrayList<>(hs);
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            a[i]=arr.get(i);
        }
        return a;
        
    }
}