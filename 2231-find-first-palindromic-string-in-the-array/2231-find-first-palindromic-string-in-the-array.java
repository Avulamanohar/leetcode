class Solution {
    public String firstPalindrome(String[] words)
     {
        boolean b=false;
        String p="";
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
             b=st(s);
             if(b==true)
             { 
                p=s;
                break;
             }
        }
        return p;
        
    }
    public boolean st(String s)
    {
        int i,j,k;
        boolean b=false;
        int n=s.length();
        i=0;
        j=n-1;
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