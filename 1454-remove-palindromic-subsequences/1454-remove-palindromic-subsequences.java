class Solution {
    public int removePalindromeSub(String s)
    {    int k=2;
    boolean b;
    b=palindrome(s);
        if(b==true)
        {
            k=1;
        }
        return k;
      

    }
    public boolean palindrome(String s)
    {
        int i,j;
        i=0;
        int n=s.length();
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