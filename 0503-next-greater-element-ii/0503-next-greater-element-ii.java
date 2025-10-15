class Solution {
    public int[] nextGreaterElements(int[] nums)
    {
        int n=nums.length;
        int a[]=new int[n];
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            st1.push(nums[i]);

        }
        for(int i=n-1;i>=0;i--)
        {
            while(!st2.isEmpty()&&st2.peek()<=nums[i])
            {
                st2.pop();
            }
            if(st2.isEmpty())
            {
            while(!st1.isEmpty()&&st1.peek()<=nums[i])
            {
                st1.pop();
            }
            if(!st1.isEmpty())
            {
                a[i]=st1.peek();
            }
            else
            {
                a[i]=-1;
            }
            }
            else
            {
                a[i]=st2.peek();
            }
            st2.push(nums[i]);
        }
        return a;
    }
}