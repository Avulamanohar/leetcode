class Solution {
    public int maxVowels(String s, int k) 
    {
        Set<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        int n=s.length();
    
        int c=0;
        for(int j=0;j<k;j++)
        {
        if(hs.contains(s.charAt(j)))
        {
            c++;
        }
        }
        int f=c;

        for(int j=k;j<n;j++)
        {
            if(hs.contains(s.charAt(j)))
            {
                c++;
            }
              if(hs.contains(s.charAt(j-k)))
            {
                c--;
            }
            f=Math.max(f,c);


        }
        return f;
        
    }
}