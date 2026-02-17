class Solution {
    public int firstUniqChar(String s) 
    {
         Map<Character,Integer> map=new LinkedHashMap<>();
         int n=s.length();
         for(int i=0;i<n;i++)
         {
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
         }
         List<Character> arr=new ArrayList<>(map.keySet());
         for(int i=0;i<arr.size();i++)
         {
            if(map.get(arr.get(i))==1)
            {
                return s.indexOf(arr.get(i));
            }
         }
         return -1;
    }
}