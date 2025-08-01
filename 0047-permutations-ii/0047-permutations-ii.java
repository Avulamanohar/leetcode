class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        int i,j,k;
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            arr.add(nums[i]);
        }
        List<Integer> arr1=new ArrayList<>();
        List<List<Integer>> arr2=new ArrayList<>();
        boolean f[]=new boolean[n];
        perm(arr,arr1,arr2,f);
        HashSet<List<Integer>> arr3=new HashSet<>(arr2);
        List<List<Integer>> arr4=new ArrayList<>(arr3);
        return arr4;

        
    }
    public void perm(List<Integer> arr,List<Integer> arr1,List<List<Integer>> arr2,boolean f[])
    {
        if(arr.size()==arr1.size())
        {
            arr2.add(new ArrayList<>(arr1));
        }
        int i,j,k;
        int n=arr.size();
        for(i=0;i<n;i++)
        {
            if(!f[i])
            {
                f[i]=true;
                arr1.add(arr.get(i));
                perm(arr,arr1,arr2,f);
                arr1.remove(arr1.size()-1);
                f[i]=false;
            }
        }
    }
}