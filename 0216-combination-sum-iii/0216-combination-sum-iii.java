class Solution {
    public List<List<Integer>> combinationSum3(int k, int n)
     {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> arr1=new ArrayList<>();
        int a[]=new int [9];
        for(int i=0;i<9;i++)
        {
            a[i]=i+1;
        }
        com(0,k,n,a,arr,arr1);
        return arr1;
        
    }
    public void com(int ind,int k,int t,int a[],List<Integer> arr,List<List<Integer>> arr1)
    {
        if(ind==a.length)
        {
            if(t==0&&arr.size()==k)
            {
                arr1.add(new ArrayList<>(arr));
            }
            return;
        }
        if(t>=a[ind]&&arr.size()<k)
        {
            arr.add(a[ind]);
            com(ind+1,k,t-a[ind],a,arr,arr1);
            arr.remove(arr.size()-1);
        }
        com(ind+1,k,t,a,arr,arr1);
    }
}