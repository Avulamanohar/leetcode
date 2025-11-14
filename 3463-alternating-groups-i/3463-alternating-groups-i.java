class Solution {
    public int numberOfAlternatingGroups(int[] colors)
     
    {
        int c=0;
        int n=colors.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<3;i++)
        {
            sb.append(colors[i]);

        }
        if(sb.toString().equals("101")||sb.toString().equals("010"))
        {
            c++;
        }
        for(int i=3;i<n+2;i++)
        {
          sb=new StringBuilder(sb.toString().substring(1,3));
          sb.append(colors[i%n]);
          if(sb.toString().equals("101")||sb.toString().equals("010"))
        {
            c++;
        }
        }
        return c;

        
    }
}