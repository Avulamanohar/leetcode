class Solution {
    public void reverseString(char[] s)
     {
        int i,j,k;
        int n=s.length;
        char b[]=new char[n];
        ArrayList<Character> arr=new ArrayList<>();
        for(i=n-1;i>=0;i--)
        {
         arr.add(s[i]);
        }
        for(i=0;i<arr.size();i++)
        {
            s[i]=arr.get(i);
        }


        
    }
}