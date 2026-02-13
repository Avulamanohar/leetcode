class Solution {
    public char findTheDifference(String s, String t) 
    {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s=new String(a);
        t=new String(b);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                return t.charAt(i);
            }
        }
        return t.charAt(t.length()-1);
    }
}