class Solution {
    public int bitwiseComplement(int n)
    {
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder(s);
        int m=s.length();
        for(int i=0;i<m;i++)
        {
            char c=sb.charAt(i);
            if(c=='1')
            {
                sb.setCharAt(i,'0');
            }
            else
            {
                               sb.setCharAt(i,'1');

            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}