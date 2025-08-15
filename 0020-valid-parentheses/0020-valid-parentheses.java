class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int i,j;
        st.push(s.charAt(0));
        for(i=1;i<n;i++)
        {  char a=s.charAt(i);
           if(!st.isEmpty()){
            if(a=='['||a=='{'||a=='(')
            {
                st.push(a);
            }
           else if(a==')'&&st.peek()=='(')
            {
                st.pop();
            }
           
            else  if(a==']'&&st.peek()=='[')
            {
                st.pop();
            }
            else if(a=='}'&&st.peek()=='{')
            {
                st.pop();
            }
            else
            {
                st.push(a);
            }
           }
            else{
                st.push(a);
            }
        
        }
     if(st.isEmpty())
     {
return true;
     }
        return false;
    }
}