class Solution {
    public int distributeCandies(int[] candyType) 
    {
        int n=candyType.length/2;
        Set<Integer> st=new HashSet<>();
        for(int i:candyType)
        {
            st.add(i);
        }
        int k=st.size();
        if(k>=n)
        {
            return n;
        }
        return k;
        
    }
}