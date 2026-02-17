class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();

        for(int i=0;i<magazine.length();i++)
        {
            char c=magazine.charAt(i);
            if(!map.containsKey(c))
            {
            map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            }
        }
         for(int i=0;i<ransomNote.length();i++)
        {
            char c=ransomNote.charAt(i);
            if(!map1.containsKey(c))
            {
            map1.put(c,1);
            }
            else
            {
                map1.put(c,map1.get(c)+1);
            }
        }
        List<Character> st=new ArrayList<>(map1.keySet());
        for(int i=0;i<st.size();i++)
        {
            char ct=st.get(i);
            if(!map.containsKey(ct))
            {
                return false;
            }
            if(map1.get(ct)>map.get(ct))
            {
                 return false;
            }
        }
        return true;
        
    }
}