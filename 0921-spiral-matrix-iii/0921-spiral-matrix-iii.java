class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) 
    {
        int l=cStart;
        int r=cStart+1;
        int t=rStart;
        int b=t+1;
        int c=0;
        List<Pair<Integer,Integer>> arr=new ArrayList<>();
        while(l>=0||t>=0||r<cols||b<rows)
        {int f;
            if(c==0)
            {
                f=l;
            }
            else
            {
                f=l+1;
            }
            
            for(int i=f;i<=r;i++)
            {
                if(t>=0&&i>=0&&i<cols)
                {
                arr.add(new Pair(t,i));
                }
            }
            l--;
            c++;
            
            
            for(int i=t+1;i<=b;i++)
            {
                if(r<cols&&i>=0&&i<rows)
                {
                arr.add(new Pair(i,r));
                }
            }
            t--;
           
            for(int i=r-1;i>=l;i--)
            {
                if(b<rows&&i>=0&&i<cols)
                {
                arr.add(new Pair(b,i));
                }
            }
           
             r++;
            for(int i=b-1;i>=t;i--)
            {
                if(l>=0&&i>=0&&i<rows)
                {
                arr.add(new Pair(i,l));
                }
            }
            b++;
        }
        int ar[][]=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++)
        {
            ar[i][0]=arr.get(i).getKey();
            ar[i][1]=arr.get(i).getValue();
        }
        return ar;
        
    }
}