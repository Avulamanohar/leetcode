class Solution {
    public String longestPalindrome(String s)
    {
        int i,j,k;
      int n=2*s.length()+1;
           StringBuilder sb=new StringBuilder(s);
    
      i=0;
      while(i<n)
      {
      sb=sb.insert(i,"#");
      i=i+2;
      }
      String f=sb.toString(); 
      int p[]=new int[n];
      int r=0;
      int c=0;
      int LongCent=0;
      int LongLen=0;
      
     char d[]=f.toCharArray();
      for(i=0;i<n;i++)
      { int m=2*c-i;
        if(r>i)
        {
            p[i]=Math.min(r-i,p[m]);
        }
        int a=i-(p[i]+1);
        int b=i+(p[i]+1);
        while(a>=0&&b<n&&d[i-(p[i]+1)]==d[i+(p[i]+1)])
        {
            p[i]++;
            a--;
            b++;
        }
        if(i+p[i]>r)
        {
            r=i+p[i];
            c=i;
        }
        if(p[i]>LongLen)
        {
            LongCent=i;
            LongLen=p[i];
        }


        
      }
      return f.substring(LongCent-LongLen,LongLen+LongCent).replace("#","");
        
    }
   

    
}