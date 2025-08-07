class Solution {
    public int removeDuplicates(int[] nums) 
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>(hs);
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}