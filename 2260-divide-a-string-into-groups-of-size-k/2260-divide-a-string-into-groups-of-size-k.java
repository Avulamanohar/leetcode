class Solution {
    public String[] divideString(String s, int k, char fill) 
    {
     int n=s.length();
     String l="";
     int b=0;
     if(n%k!=0)
     {
       l=s.substring(n-n%k,n);
       b++;
     }
     String ar[]=new String[b+n/k];
     for(int i=0;i<k-n%k;i++)
     {
        s+=fill+"";
     }
     int j=0;
     for(int i=0;i<n;i=i+k)
     {
         ar[j++]=s.substring(i,i+k);
     }
     return ar;
        
    }
}