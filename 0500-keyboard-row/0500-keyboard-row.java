class Solution {
    public String[] findWords(String[] words) 
    {
        String s1="qwertyuiopQWERTYUIOP";
        String s2="asdfghjklASDFGHJKL";
        String s3="zxcvbnmZXCVBNM";
        int a[]=new int[words.length];
       
        for(int i=0;i<words.length;i++)
        {
            String b=words[i];
            int k=-1;
            String c=b.charAt(0)+"";
            if(s1.contains(c))
            {
                k=1;
            }
            else if(s2.contains(c))
            {
             k=2;   
            }
            else
            {
                k=3;
            }
            for(int j=1;j<b.length();j++)
            {
                String t=b.charAt(j)+"";
                if(k==1&&!s1.contains(t))
                {
                    a[i]=-1;
                
                }
                if(k==2&&!s2.contains(t))
                {
                    a[i]=-1;
                    
                }
                if(k==3&&!s3.contains(t))
                {
                    a[i]=-1;
                    
                }
            }
        }
        List<String> st=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(a[i]!=-1)
            {
                st.add(words[i]);
            }
        }
        int n=st.size();
        String str[]=new String[n];
        for(int i=0;i<st.size();i++)
        {
            str[i]=st.get(i);
        }
        return str;
        
    }
}