class Solution {
    public String reverseStr(String s, int k) 
    {  
         int n=s.length();
    int i=0;
   
       StringBuilder sb1=new StringBuilder(s);
        while(i<n)
        {   String a="";
            if(i+k<=n)
            {
       a=s.substring(i,i+k);
            }
            else
            {
          a=s.substring(i,n);
            }
     
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        sb1.delete(i,i+k);
        sb1.insert(i,sb);
        i=i+2*k;

        }
        return sb1.toString();
        
    }
}