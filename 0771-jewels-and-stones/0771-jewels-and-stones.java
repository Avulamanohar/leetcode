class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int a=0;
        char b[]=jewels.toCharArray();
        Set<Character> st=new HashSet<>();
        for(char k:b)
        {
            st.add(k);
        }
        List<Character> lt=new ArrayList<>(st);
        char t[]=new char[lt.size()];
        for(int i=0;i<lt.size();i++)
        {
            t[i]=lt.get(i);
        }
        jewels=new String(t);
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++ )
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    a++;
                }
            }
        }
        return a;
        
    }
}