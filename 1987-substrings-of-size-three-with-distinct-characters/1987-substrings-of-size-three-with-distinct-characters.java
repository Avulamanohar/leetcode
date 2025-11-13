class Solution {
    public int countGoodSubstrings(String s) 
    {
      Map<Character,Integer> st=new HashMap<>();
      int c=0;
      int k=0;
      int n=s.length();
      if(n<3)
      {
        return 0;
      }
      while(k<3)
      {
        if(st.containsKey(s.charAt(k)))
        {
            st.put(s.charAt(k),st.get(s.charAt(k))+1);
        }
        else
        {
            st.put(s.charAt(k),1);
        }
        k++;
      }
      if(st.size()==3)
      {
        c++;
      }
      for(int i=3;i<n;i++)
      {
         if(st.containsKey(s.charAt(i)))
        {
            st.put(s.charAt(i),st.get(s.charAt(i))+1);
        }
        else
        {
            st.put(s.charAt(i),1);
        }
        
         if(st.containsKey(s.charAt(i-3)))
        {
            st.put(s.charAt(i-3),st.get(s.charAt(i-3))-1);
            if(st.get(s.charAt(i-3))==0)
            {
                st.remove(s.charAt(i-3));
            }
        }
        if(st.size()==3)
        {
            c++;
        }
        
        
      }
      return c;
    }
    
}