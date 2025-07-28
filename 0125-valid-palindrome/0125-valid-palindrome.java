class Solution {
    public boolean isPalindrome(String s) {
        
        String c=s.replaceAll("[^a-zA-Z0-9]","");
        String d=c.toLowerCase();
        StringBuilder g=new StringBuilder(d);
        StringBuilder k=g.reverse();
        String f=k.toString();
        
        return f.equals(d);
        
    }
}