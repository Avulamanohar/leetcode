class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int k=Math.max(0,gain[0]);
        for(int i=1;i<n;i++)
        {
           gain[i]+=gain[i-1];
           k=Math.max(gain[i],k);
        }
        return k;
        
    }
}