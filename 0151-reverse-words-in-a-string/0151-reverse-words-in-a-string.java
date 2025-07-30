class Solution {
    public String reverseWords(String s) 
    {
        s=s.trim();
        ArrayList<String> a=new ArrayList<String>();
        int n=s.length();
        int i=0;
        int j=0;
       while(i<n&&j<n)
       {
        if(s.charAt(j)!=' ')
        {
            j++;
        }
        else
        {
            a.add(s.substring(i,j));
            while(s.charAt(j)==' ')
            {
                j++;
            }
            i=j;

        }
        if(j==n)
        {
            a.add(s.substring(i,j));
        }
       }
       int m=a.size();
       int k;
       String p="";
     //  return a.get(m-1);
       StringBuilder sc=new StringBuilder(p); 
       for(k=m-1;k>=0;k--)
       {
        StringBuilder st=new StringBuilder(a.get(k));
        sc=sc.append(st).append(" ");
        
       }
       p=sc.toString().trim();
       return p;

    }
}