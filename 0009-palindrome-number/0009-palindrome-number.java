class Solution {
    public boolean isPalindrome(int x)
    {
        String s=Integer.toString(x);
      
     return b(s);
        
    }
    public boolean b(String s)
    {
        int n=s.length();
        int i,j;
        i=0;
        j=n-1;
        boolean b=false;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                break;
            }
            i++;
            j--;
        }
     if(i>j)
     {
        b=true;
     }
     return b;

    }
}