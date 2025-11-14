class Solution {
    public int numberOfAlternatingGroups(int[] colors)
     
    {
        int c=0;
        int n=colors.length;
        String sb="";
        for(int i=0;i<3;i++)
        {   if(colors[i]==1)
        {
            sb+="1";
        }
            else
            {
                sb+="0";
            }

        }
        if(sb.equals("101")||sb.equals("010"))
        {
            c++;
        }
        for(int i=3;i<n+2;i++)
        {
          sb=sb.substring(1,3);
           if(colors[i%n]==1)
        {
            sb+="1";
        }
            else
            {
                sb+="0";
            }
          if(sb.equals("101")||sb.equals("010"))
        {
            c++;
        }
        }
        return c;

        
    }
}