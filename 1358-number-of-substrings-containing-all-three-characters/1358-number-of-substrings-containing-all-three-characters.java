class Solution {
    public int numberOfSubstrings(String s)
     {
     
       int n=s.length();
       int k=0;
       int a=-1;
       int b=-1;
       int c=-1;
       for(int i=0;i<s.length();i++)
       {
          Set<Character> st=new HashSet<>();
        
     
            if(s.charAt(i)=='a')
            {
                a=i;
            }
            else if(s.charAt(i)=='b')
            {
                b=i;
            }
            else
           {
            c=i;
           }

           if(a!=-1&&b!=-1&&c!=-1)
           {
           k+=Math.min(a,Math.min(b,c))-(-1);
           }
        
        
        
       }
       return k;
    }
}