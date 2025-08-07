class Solution {
    public boolean judgeCircle(String moves)
    {
        int a=0;
        int b=0;
        String j=moves;
        int s=moves.length();
        for(int i=0;i<s;i++)
        {
            if(j.charAt(i)=='U')
            {
               a++;
            }
              if(j.charAt(i)=='D')
            {
                a--;
            }
              if(j.charAt(i)=='L')
            {
                b--;
            }
              if(j.charAt(i)=='R')
            {
             b++;   
            }
        }
        if(a==0&&b==0)
        {
            return true;
        }
        return false;
    }
}