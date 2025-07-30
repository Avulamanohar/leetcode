class Solution {
    public boolean isAnagram(String s, String t)
     {
      
        char c[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(b);
        String i=new String(c);
        String j=new String(b);
        return i.equals(j);


    }
}