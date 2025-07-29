class Solution {
    public int longestPalindrome(String s) 
    {
        
        int i,j,k;
        HashMap<Character,Integer> hs=new HashMap<>();
        int n=s.length();
        for(i=0;i<n;i++)
        {    char b=s.charAt(i);
            if(hs.containsKey(b))
            {
                hs.put(b,hs.get(b)+1);
            }
            else
            {
                hs.put(b,1);
            }
        }
        
        HashSet<Character> h1=new HashSet();
        
        for(i=0;i<n;i++)
        {
            h1.add(s.charAt(i));
        }
        int m=h1.size();
         ArrayList<Character> h=new ArrayList<>(h1);

        int count1=0;
        int count=0;
        for(j=0;j<m;j++)
        {
         char y=h.get(j);  
         int l=hs.get(y);     
         if(l>1)
         {
            if(l%2==0)
            {
                count+=l;
            }
            else
            {
                count1++;
                l--;
                count +=l;
            }
         }
         else
         {
            count1++;
         }

        }
        if(count1>0)
        {
            count++;

        }
        return count;




    }
    public boolean palindrome(String s)
    {   boolean b=false;
        int i,j;
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
            j++;
        }
        if(i>j)
        {
            b=true;
        }
        return b;

    }
}