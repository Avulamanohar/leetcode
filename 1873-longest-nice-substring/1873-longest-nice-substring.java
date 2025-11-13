class Solution {
    public String longestNiceSubstring(String s)
     {
        int a=(int)'a'-(int)'A';
        int b=(int)'a'-1;
        int k=0;
        int f=-1;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            Set<Character> st=new HashSet<>();
            int d=0;
            for(int j=i;j<s.length();j++)
            {
                 int t=(int)s.charAt(j);
                 if(t<b)
                 {
                    char c=(char)(t+a);
                    if(st.contains(c)&&!st.contains(s.charAt(j)))
                    {
                        d++;
                    }
                    st.add(s.charAt(j)); 
                 }
                 else
                 {
                    char c=(char)(t-a);
                    if(st.contains(c)&&!st.contains(s.charAt(j)))
                    {
                        d++;
                    }
                    st.add(s.charAt(j));

                 }
                 
                 if(st.size()==d*2)
                 {
                    if(j-i+1>max)
                    {
                    k=i;
                    f=j;
                    max=j-i+1;
                    }
                    
                 }
                
            }
        }
        return s.substring(k,f+1);
    
        
    }
}