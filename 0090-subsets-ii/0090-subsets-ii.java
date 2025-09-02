class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
     Set<List<Integer>> arr2=new HashSet<>();
     List<Integer> arr1=new ArrayList<>();  
     sub(0,nums,arr1,arr2); 
 List<List<Integer>> arr=new ArrayList<>(arr2);
     return arr;
    }
    public void sub(int ind,int nums[],List<Integer> arr1,Set<List<Integer>> arr)
    {
        if(ind==nums.length)
        {  
            arr.add(new ArrayList<>(arr1));
            return;
        }

        sub(ind+1,nums,arr1,arr);
              arr1.add(nums[ind]);
        sub(ind+1,nums,arr1,arr);
        arr1.remove(arr1.size()-1);
    }
}