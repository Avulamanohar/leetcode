class Solution {
    public int numberOfAlternatingGroups(int[] colors)
     
    {
       int c=0;
        int n=colors.length;
        for(int i=0;i<n;i++)
        {
            if(colors[(n+(i-1))%n]!=colors[i]&&colors[(n+(i+1))%n]!=colors[i])
            {
                c++;
            }

        }
        return c;
        
    }
}