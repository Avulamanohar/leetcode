class Solution {
    public int sumSubarrayMins(int[] arr)
    {   int n=arr.length;
        int p[]=new int[n];
        int s[]=new int[n];
        p[0]=-1;
        s[n-1]=n;
        Stack<Integer> st1=new Stack<>();
        st1.push(n-1);
        Stack<Integer> st2=new Stack<>();
        st2.push(0);
        for(int i=n-2;i>=0;i--)
        {
            while(!st1.isEmpty()&&arr[st1.peek()]>arr[i])
            {
                st1.pop();
            }
            if(!st1.isEmpty())
            {
                s[i]=st1.peek();
               
            }
            else
            {
                s[i]=n;
            }
             st1.push(i);
        }
          for(int i=1;i<n;i++)
        {
            while(!st2.isEmpty()&&arr[st2.peek()]>=arr[i])
            {
                st2.pop();
            }
            if(!st2.isEmpty())
            {
                p[i]=st2.peek();
            }
            else
            {
                p[i]=-1;
            }
            st2.push(i);
        }
        long sum=0;
        int m=(int)1e9+7;
        for(int i=0;i<n;i++)
        {long k=(long)(i-p[i])*(s[i]-i);
        sum=(sum+k*arr[i])%m;

        }
        return (int)sum;

        
    }
}