class Solution {
    public int countSubstrings(String s)
    {
        int i,j,k;
        int n=s.length();
        ArrayList<String> arr=new ArrayList<>();
   
        int count=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                 String g=s.substring(i,j+1);
    
                 if(pali(g))
                 {
                    count++;
                 }

            }
        }
        return count;
        
    }
    public boolean pali(String s)
    {
        int i,j;
        int n=s.length();
        boolean b=false;
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