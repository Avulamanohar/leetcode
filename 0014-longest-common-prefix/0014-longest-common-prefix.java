import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs)
    {   int i,j,k;
        int n=strs.length;
        if(n==0)
        {
            return "";
        }
        String p=strs[0];

        for(i=1;i<n;i++)
        {         int m=p.length();
           int o=strs[i].length();
           if(m>o)
           {
            p=strs[i];
           }
        }
        ArrayList<String> arr=new ArrayList<>();
        k=0;
            for(j=0;j<p.length();j++)
            {
                arr.add(p.substring(k,j+1));
            } 

        Collections.reverse(arr);

        String g="";
        
        boolean b=false;
        for(i=0;i<arr.size();i++)
        {   
            String y=arr.get(i);
            for(j=0;j<n;j++)
            {
                if(strs[j].startsWith(y))
                {
                    b=true;
                    
                }
                else
                {
                    b=false;
                    break;
                }
            }
            if(b==true)
            {
               g=arr.get(i);
               break;
            }
        }
        return g;
        
    }
}