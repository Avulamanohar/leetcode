class Solution {
    public String reverseWords(String s) 
    {
        int i,j;
        int n=s.length();
        List<String> st=new ArrayList<>();
        i=0;
        while(i<n)
        {
            j=i;
            while(j<n&&s.charAt(j)!=' ')
            {
                j++;
            }
       
            StringBuilder sb=new StringBuilder(s.substring(i,j));
                 st.add(sb.reverse().toString());
            i=j+1;
            if(i>=n)
            {
                break;
            }

        }
        int m=st.size();
        String b="";
        for(i=0;i<m;i++)
        {
           b+=st.get(i)+" ";
        }
        return b.trim();
        
    }
}