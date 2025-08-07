class Solution {
    public boolean wordPattern(String pattern, String s) 
    {   int i,j;
        HashMap<Character,String> hs =new HashMap<>();
        int m=s.length();
        int n=pattern.length();
        
        List<String> st=new ArrayList<>();
        word(s,st);
        boolean d=true;
        if(pattern.length()!=st.size())
        {
            return false;
        }
        HashSet<String> hm =new HashSet<>();
        for(i=0;i<n;i++)
        {   char a=pattern.charAt(i);
            String b=st.get(i);
            hm.add(b);
            if(hs.containsKey(a))
            {
              String c=hs.get(a);
              if(!c.equals(b))
              {
              d=false;
              break;
              }
              else
              {

              }
            }
            else
            {
                  hs.put(a,b);
            }
        }
      if(hm.size()!=hs.size())
      {
        d=false;
      }
       
        return d;


        
    }
    public void word(String s,List<String> st)
    {   int i=0;
        int j;
        int n=s.length();

        while(i<n)
        { 
            j=i;
            while(j<n && s.charAt(j)!=' ' )
            {
                
                j++;
                
                
                
            }
            st.add(s.substring(i,j));
            i=j+1;
            if(i>n)
            {
                break;
            }

        }

    }
}