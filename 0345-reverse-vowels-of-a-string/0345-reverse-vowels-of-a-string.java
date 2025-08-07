class Solution {
    public String reverseVowels(String s) 
    {   int i,j;
        char c[]={'a','e','i','o','u','A','E','I','O','U'};
        List<Character> cr=new ArrayList<>();
        int n=s.length();
        List<Integer> arr=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            for(j=0;j<c.length;j++)
            {
                if(s.charAt(i)==c[j])
                {
                    cr.add(c[j]);
                    arr.add(i);
                }
            }
        }
        char d[]=s.toCharArray();
        Collections.reverse(cr);
        for(i=0;i<arr.size();i++)
        {
            d[arr.get(i)]=cr.get(i);
        }
        String h=new String(d);
        return h;

        
    }
}