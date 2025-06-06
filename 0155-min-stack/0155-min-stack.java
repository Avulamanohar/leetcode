class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min_s;
    public MinStack() {
        stack= new Stack<Integer>();
        min_s=new Stack<Integer>();
    }
    
    public void push(int val)
     {
        stack.push(val);
        if(min_s.isEmpty())
        {
            min_s.push(val);
        }
        else
        {
            min_s.push(Math.min(val,min_s.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        min_s.pop();
    }
    
    public int top()
     {
      return stack.peek(); 
    }
    
    public int getMin() {
        return min_s.peek();
    }
   
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */