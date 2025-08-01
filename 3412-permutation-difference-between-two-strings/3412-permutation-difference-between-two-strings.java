class Solution {
    public int findPermutationDifference(String s, String t) 
    {
        int i,j,k;
        int n=s.length();
        int sum=0;
        for(i=0;i<n;i++)
        {
         
            int b=t.indexOf(s.charAt(i));
            sum+=Math.abs(i-b);

        }
        return sum;

        
    }
}