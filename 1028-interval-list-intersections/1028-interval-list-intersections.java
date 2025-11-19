class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList)
    {
        List<Pair<Integer,Integer>> arr=new ArrayList<>();
        for(int i=0;i<firstList.length;i++)
        { int a=firstList[i][0];
          int b=firstList[i][1];
            for(int j=0;j<secondList.length;j++)
            {
                int c=secondList[j][0];
                   int d=secondList[j][1];
                if(a>c)
                {
                    if(c<=a&&a<=d)
                    {
                        int e=Math.max(a,c);
                        int f=Math.min(b,d);
                        arr.add(new Pair<>(e,f));
                    }
                }
                else
                {
                    if(a<=c&&c<=b)
                    {
                        int e=Math.max(a,c);
                        int f=Math.min(b,d);
                        arr.add(new Pair<>(e,f));
                    }
                }
            }
        }
        int kr[][]=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++)
        {
            kr[i][0]=arr.get(i).getKey();
            kr[i][1]=arr.get(i).getValue();
        }
        return kr;
        
    }
}