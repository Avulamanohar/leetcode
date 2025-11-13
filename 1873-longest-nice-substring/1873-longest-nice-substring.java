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
            Set<Character> up=new HashSet<>();
            Set<Character> lp=new HashSet<>();
            Set<Character> ov=new HashSet<>();
            

           
            for(int j=i;j<s.length();j++)
            { 
                int c=(int)s.charAt(j);
                if(c<b)
                {
                    up.add(s.charAt(j));
                }
                else
                {
                    lp.add(s.charAt(j));
                }
                char h=s.charAt(j);
                ov.add(Character.toLowerCase(h));
                 
                 
                 if(ov.size()==up.size()&&up.size()==lp.size())
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