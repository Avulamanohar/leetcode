class Solution {
    public int numberOfSubarrays(int[] nums, int k)
    {
       Queue<Integer> q=new LinkedList<>();
       q.add(-1);
      int c=0;
      int sum=0;
      int f=0;
      int i=0;
    while(i<nums.length)
       { 
        if(nums[i]%2==1)
        {   q.add(i);
            if(q.size()==k+1)
            { int a=q.poll();
            System.out.println(a);
              
                f=q.peek()-(a+1)+1;
                sum+=f;
            }
        }
        else
        {
            if(q.size()==k)
               sum+=f;
        }
        i++;
         
       }
       return sum;
    }
}