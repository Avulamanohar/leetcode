class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) 
    {
        
        List<Integer> arr=new ArrayList<>();
             Set<List<Integer>> arr1=new HashSet<>();
             sub(0,nums,arr,arr1);
        List<List<Integer>> arr2=new ArrayList<>(arr1);
        return arr2;
        
    }
    public void sub(int ind,int nums[],List<Integer> arr,Set<List<Integer>> arr1)
    {
        if(ind==nums.length)
        {   if(arr.size()>=2)
        {
            arr1.add(new ArrayList<>(arr));
        }
            return;
        }
        if(arr.size()==0)
        {
        arr.add(nums[ind]);
          sub(ind+1,nums,arr,arr1);
            arr.remove(arr.size()-1);
        sub(ind+1,nums,arr,arr1);
        }
        else
        {
            if(nums[ind]>=arr.get(arr.size()-1))
            
            {
                arr.add(nums[ind]);
                  sub(ind+1,nums,arr,arr1);
                   arr.remove(arr.size()-1);
        sub(ind+1,nums,arr,arr1);
            }
            else
            {
                 sub(ind+1,nums,arr,arr1);
            }
           
        }
    }
}