class Solution {
    public String longestPalindrome(String s)
    {
      int i,j;
     
      String f=preProcess(s);
       int n=f.length();
      int p[]=new int[n];
      i=0;
      while(i<n)
      {
        p[i]=1;
        i++;
      }
      char g[]=f.toCharArray();
      int cent=0;
      int right=0;
      int ll=0;
      int lc=0;
      for(i=0;i<n;i++)
      { 
        int mirror=2*cent-i;
        if(right>i)
        {
            p[i]=Math.min(right-i,p[mirror]);
        }
        int a=i-p[i];
        int b=i+p[i];
        while(a>=0&&b<n&&g[a]==g[b])
        {
            p[i]++;
            a--;
            b++;
        }
        if(i+p[i]>right)
        {right=p[i]+i;
        cent=i;
        }
        if(p[i]>=ll)
        {
            ll=p[i];
            lc=i;
        }
        

      }
      int start=(lc-ll+1)/2;


      return /* Integer.toString(lc);*/  s.substring(start,start+ll-1);
    }
    public String preProcess(String s)
    {
        int i,j;
        StringBuilder sb=new StringBuilder(s);
        int n=2*s.length()+1;
        i=0;
        while(i<n)
        {
             sb=sb.insert(i,"#");
             i=i+2;
        }
        String f="";
        f=sb.toString();
        return f;
    }
   

    
}