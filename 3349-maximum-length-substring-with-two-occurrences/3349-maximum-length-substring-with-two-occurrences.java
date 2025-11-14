class Solution {
    public int maximumLengthSubstring(String s) 
    {
        int n=s.length();
        int c=0;
        for(int j=0;j<n;j++)
        {Map<Character,Integer> map=new HashMap<>();
            for(int i=j;i<n;i++)
            {
                 if(map.containsKey(s.charAt(i)))
                 {
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                 }
                 else
                 {
                    map.put(s.charAt(i),1);
                 }
                 if(map.get(s.charAt(i))>2)
                 {
                    break;
                 }
                c=Math.max(i-j+1,c);
                
            }
        }
        return c;
        
    }
}