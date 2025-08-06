class Solution {
    public int reverse(int x) 

    {  
        long t=x;
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
       
        String s=Long.toString(t);
       StringBuilder sb;
       String g="";
        if(t>=0)
        {
         sb=new StringBuilder(s);
         sb.reverse();

        }
        else
        {
            sb=new StringBuilder(s.substring(1));
            sb.reverse();
            g+="-";
        }
        g=g.concat(sb.toString());
        long h=Long.parseLong(g);
         if(h<a || h>b)
        {
return 0;
        }
        return (int)h;        
    
        
    }
}