class Solution {
    public String largestOddNumber(String num) 
    {
        int n=num.length();
        StringBuffer sb=new StringBuffer(num);
        sb.reverse();
        for(int i=0;i<n;i++)
        {  char c=sb.charAt(i);
        int a=c-'0';
            if(a%2==1)
            {  String b=sb.substring(i,n).toString();
        StringBuffer s=new StringBuffer(b);
        s.reverse();

              
                return s.toString();
            }
        }
        return "";
    }
}