class Solution {
    public String capitalizeTitle(String title)
    {
        String s=title.toLowerCase();
        List<String> ls=new ArrayList<String>();
        int i,j;
        int n=title.length();
        i=0;
        while(i<n)
        {
            j=i;
            while(j<n&&s.charAt(j)!=' ')
            {
                j++;
            }
         
            ls.add(s.substring(i,j));
            i=j+1;
            if(i>=n)
            {
                break;
            }
        } 
        int m=ls.size();
        String g="";
        for(i=0;i<m;i++)
        {    String o=ls.get(i);
            if(o.length()>2)
            {
                o=Cap(o);
                
            }
            g+=o+" ";
        }
     return g.trim();
        
    }
    public String Cap(String s)
    {
        String a=s.charAt(0)+"";
        return a=a.toUpperCase()+s.substring(1);

    }
}