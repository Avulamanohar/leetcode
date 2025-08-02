class Solution {
    public boolean detectCapitalUse(String word) 
    {   
        String s=word;
        String b=s.toUpperCase();
        String c=s.toLowerCase();
        String d=word.substring(0,1).toUpperCase();
        String j=d+word.substring(1).toLowerCase();
           boolean e=false;
        if(word.equals(j))
        {
            e= true;
        }  
        if(word.equals(b))
        {
            e=true;
        }
        if(word.equals(c))
        {
            e=true;
        }
        return e;

        
    }
}