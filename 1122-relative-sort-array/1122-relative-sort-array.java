class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        int n=arr1.length;
        for(int i=0;i<arr2.length;i++)
        {
            map.put(arr2[i],0);
        }
        for(int i=0;i<n;i++)
        {   
            if(!map.containsKey(arr1[i]))
            {
                arr.add(arr1[i]);
            }
            else
            {
             map.put(arr1[i],map.get(arr1[i])+1); 
            }
        }
            int j=0;
        for(int i=0;i<arr2.length;i++)
        {
           
            int a=map.get(arr2[i]);
            while(a!=0)
            {
                arr1[j++]=arr2[i];
                a--;
            }
          
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            arr1[j++]=arr.get(i);
        }
       return arr1; 
    }
}