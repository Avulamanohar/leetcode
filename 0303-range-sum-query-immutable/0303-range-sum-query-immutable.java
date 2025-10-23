class NumArray {
     public   int b[];
    public NumArray(int[] nums)

    {
        int n=nums.length;
         b=new int[n];
        this.b[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            b[i]=nums[i]+b[i-1];
        }
        
    }
    
    public int sumRange(int left, int right) {
        int k=0;
       
    
    
            k=b[right];
            if(left>0)
            {
                k-=b[left-1];
            }
            
    
        return k;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */