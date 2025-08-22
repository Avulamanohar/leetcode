class Solution {
    public String makeFancyString(String s) 
    {
        int n=s.length();
       
        int count=1;
        char c=s.charAt(0);
         StringBuilder b=new StringBuilder();
         b.append(c);
        for(int i=1;i<n;i++)
        {   
            char d=s.charAt(i);
            if(d==c)
            {
                count++;
            }
            else
            {
                c=d;
                count=1;
            }
            if(count<3)
            {
                b.append(c);
            }
        }
     return b.toString();   
    }
}