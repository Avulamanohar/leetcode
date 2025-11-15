class Solution {
    public int[] shuffle(int[] nums, int n) 
    { 
   int a[]=new int[2*n];
   for(int i=0;i<2*n;i=i+2)
   {  int j=i/2;
         a[i]=nums[j];
         a[i+1]=nums[n+j];
   }
   return a;
   
    }
}