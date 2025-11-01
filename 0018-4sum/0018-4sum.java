    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target)
        {
             int n=nums.length;
        Arrays.sort(nums);
      
      List<List<Integer>> arr=new ArrayList<>();
        
        int maxi=Integer.MIN_VALUE;
        for(int p=0;p<n-3;p++)
        {
            if(p>0&&nums[p]==nums[p-1])
            {
                continue;
            }
        for( int i=p+1;i<n-2;i++)
        {  
           
          int j=i+1;
          int k=n-1;
          if(i>p+1&&nums[i]==nums[i-1])
          {
            continue;
          }
          while(j<k)
          {
             List<Integer> arrr=new ArrayList<>();
            long sum=(long)(nums[p])+nums[i]+nums[j]+nums[k];
            if(sum==(long)target)
            {arrr.add(nums[p]);
              arrr.add(nums[i]);
              arrr.add(nums[j]);
              arrr.add(nums[k]);
               j++;
               k--;
                while(j<k&&nums[j]==nums[j-1])
                {
                  j++;

                }
                while(j<k&&nums[k]==nums[k+1])
                {
                    k--;
                }
                arr.add(arrr);

            }
            else if(sum<target)
            {
                j++;
              
            }
            else
            {
                k--;
              
            }
          }
        }
            
               
                 
            
          
        }

return arr;
            
        }
       
    }