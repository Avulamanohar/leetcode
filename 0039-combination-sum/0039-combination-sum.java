class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
     List<Integer> arr=new ArrayList<>();
     List<List<Integer>> arr1=new ArrayList<>();
     com(0,target,candidates,arr,arr1);
     return arr1;   
    }
    public void com(int ind,int t,int a[],List<Integer> arr,List<List<Integer>> arr1)
    {
        if(ind==a.length)
        { if(t==0)
            arr1.add(new ArrayList<>(arr));
            return;
        }
        if(a[ind]<=t)
        {
            arr.add(a[ind]);
            com(ind,t-a[ind],a,arr,arr1);
            arr.remove(arr.size()-1);
        }
        com(ind+1,t,a,arr,arr1);
    }
}