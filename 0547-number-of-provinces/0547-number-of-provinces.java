class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<>());
        }
        boolean b[]=new boolean[n];
        int m=isConnected[0].length;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
            if(isConnected[i][j]==1)
            {
                arr.get(i).add(j);
            }
          }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!b[i])
            {
              c++;
              dfs(i,arr,b);
            }
        }
        return c;
        
    }
    public void dfs(int n,ArrayList<ArrayList<Integer>> arr,boolean b[])
    {
        if(b[n])
        {
            return;
        }
        b[n]=true;
        for(int i=0;i<arr.get(n).size();i++)
        {
            int a=arr.get(n).get(i);
            if(!b[a])
            {
            dfs(a,arr,b);
            }
        }
    }

}