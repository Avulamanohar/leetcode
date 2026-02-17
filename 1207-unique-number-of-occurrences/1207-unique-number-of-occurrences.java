class Solution {
    public boolean uniqueOccurrences(int[] arr)
    {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
           if(!map.containsKey(arr[i]))
           {
           map.put(arr[i],1);
           }
           else
           {
            map.put(arr[i],map.get(arr[i])+1);
           }
        }
        Set<Integer> st=new HashSet<>(map.values());
        return st.size()==map.size();
        
    }
}