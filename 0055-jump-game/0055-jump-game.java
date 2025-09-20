class Solution {
    public boolean canJump(int[] nums) 
    {    int n=nums.length;
         int a[]=new int[n+1];
         for(int i=0;i<=n;i++)
         {
           
                a[i]=-1;
            
         }
     return can(0,nums,nums.length,0,a);
    

        
    }
    public boolean can(int ind,int a[],int n,int sum,int arr[])
    {  
        if(ind>=n-1)
        {return true;}
      
        if(arr[ind]!=-1)
        {
            return arr[ind]==1;
        }
     
         boolean b=false;

        for(int i=1;i<=a[ind];i++)
        {
            
              b=b|| can(ind+i,a,n,sum+i,arr);
              
              if(!b)
              {

                arr[ind]=0;
              }
              else
              {  arr[ind]=1;
                                return true;
              
              }
            
            
        }
        return b;
    }
}