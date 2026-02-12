class pair
{
    int x;
    int y;
    pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) 
    {
        boolean br=false;
        int n=grid.length;
        int m=grid[0].length;
        boolean b[][]=new boolean[n][m];
      Queue<pair> q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                      q.add(new pair(i,j));
                    
                }
                if(grid[i][j]==1)
                {
                    br=true;
                }
            }
        }
        int cr=0;
        if(!br) 
        {
            return 0;
        }
        while(!q.isEmpty())
         { int o=q.size();
            for(int i=0;i<o;i++)
            {
                pair p=q.poll();
                int r=p.x;
                int c=p.y;
                if(r>-1&&r<n&&c>-1&&c<m)
                {
                    if(r>0&&!b[r-1][c]&&grid[r-1][c]==1)
                    {
                        grid[r-1][c]=2;
                        b[r-1][c]=true;
                        q.add(new pair(r-1,c));
                    }
                    if(r<n-1&&!b[r+1][c]&&grid[r+1][c]==1)
                    {
                        grid[r+1][c]=2;
                        b[r+1][c]=true;
                        q.add(new pair(r+1,c));

                    }
                    if(c>0&&!b[r][c-1]&&grid[r][c-1]==1)
                    {
                        grid[r][c-1]=2;
                        b[r][c-1]=true;
                        q.add(new pair(r,c-1));

                    }
                    if(c<m-1&&!b[r][c+1]&&grid[r][c+1]==1)
                    {
                        grid[r][c+1]=2;
                        b[r][c+1]=true;
                        q.add(new pair(r,c+1));

                    }
                }
               
                
            }
            if(!q.isEmpty())
            {
                cr++;
            }
         }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                  return -1;
                    
                }
            }
        }
       
         return cr;
        
    }
}