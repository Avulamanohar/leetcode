class Solution {
    public int[] rearrangeArray(int[] nums)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        int i,j;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                arr.add(nums[i]);
            }
            else
            {
                arr1.add(nums[i]);
            }
        } 
        j=0;
        ArrayList<Integer> arr3=new ArrayList<>();
        while(j<n/2)
        {
            arr3.add(arr.get(j));
            arr3.add(arr1.get(j));
            j++;
        }
        for(i=0;i<n;i++)
        {
            nums[i]=arr3.get(i);
        }
        return nums;
        
    }
}