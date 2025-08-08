class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        List<Integer> arr=new ArrayList<>();
        merges(nums1,nums2,m,arr);
        for(int i=0;i<arr.size();i++)
        {
            nums1[i]=arr.get(i);
        }
    }
    public void merges(int nums1[],int nums2[],int m,List<Integer> arr)
    {
        int j=0;
        int   i=0;
        int n=nums2.length;
       
        while(i<m&&j<n)
        {  
        
            if(nums1[i]>nums2[j])
            {
                arr.add(nums2[j]);
                j++;
            }
             else
            {
                arr.add(nums1[i]);
                i++;
            }
        
        }
        
             while(i<m)
        {
            arr.add(nums1[i]);
            i++;
        }
        while(j<n)
        
        {
           
           arr.add(nums2[j]);

            j++;

        }   

    }
}