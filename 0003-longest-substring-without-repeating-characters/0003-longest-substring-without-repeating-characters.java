import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s)
     {
       int i,j,f;
       
       int n=s.length();
       if(n==0)
       {
             return 0;
       }
    
       int count1=Integer.MIN_VALUE;
       ArrayList<Character> arr=new ArrayList<>();
       for(i=0;i<n;i++)
        {  int k=-1;
            for(j=0;j<arr.size();j++)
            {
                if(arr.get(j)==s.charAt(i))
                {
                  k=j;
                  break;

                }
              
                
            } 
            if(k!=-1)
            { 
                ArrayList<Character> c=new ArrayList<>();
                for(f=j+1;f<arr.size();f++)
                {
                    c.add(arr.get(f));
                }
                char a[]=new char[c.size()];
                for(f=0;f<c.size();f++)
                {
                    a[f]=c.get(f);
                }
                arr.clear();
                for(f=0;f<a.length;f++)
                {
                    arr.add(a[f]);
                }
                
            }
            arr.add(s.charAt(i));
            count1=Math.max(count1,arr.size());
        }
        return count1;
    }
}