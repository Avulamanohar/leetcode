class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        Map<String,Integer> map=new HashMap<>();
        int n=list1.length;
        int m=list2.length;
        int f=Integer.MAX_VALUE;
        List<String> lk=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                   map.put(list1[i],i+j);
                   f=Math.min(f,i+j);
                }
            }
        }
        List<String> lf=new ArrayList<>(map.keySet());
        for(int i=0;i<lf.size();i++)
        {
            if(map.get(lf.get(i))==f)
            {
                lk.add(lf.get(i));
            }
        }
        int h=lk.size();
        String[] pg=new String[h];
        for(int i=0;i<h;i++)
        {
             pg[i]=lk.get(i);
        }
        return pg;
        
    }
}