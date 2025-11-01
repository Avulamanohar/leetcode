class Solution {
    public int[][] merge(int[][] intervals) 
    {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      ArrayList<Pair<Integer,Integer>> arr=new ArrayList<>();
      int a=intervals[0][0];
      int b=intervals[0][1];
      for(int i=1;i<intervals.length;i++)
      {
        int k=intervals[i][0];
        int k1=intervals[i][1];
        if(k>=a&&k<=b)
        {
            a=Math.min(k,a);
            b=Math.max(b,k1);
        }
        else
        {
            arr.add(new Pair(a,b));
            a=k;
            b=k1;
        }
      }
      arr.add(new Pair(a,b));
      int ar[][]=new int[arr.size()][2];
      int j=0;
      for(Pair<Integer,Integer> p:arr)
      {
        ar[j][0]=p.getKey();
        ar[j++][1]=p.getValue();
      }

      return ar;
    }
}