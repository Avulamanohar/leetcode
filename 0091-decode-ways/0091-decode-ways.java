class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
        for(int i=0;i<=s.length();i++)
        {
            dp[i]=-1;
        }
        return Decode(0,s,dp);
    }
    public int Decode(int ind,String s,int dp[])
    {
        
        if(ind==s.length())
        {return 1;
        }
        if(s.charAt(ind)=='0')
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        String b;
        if(s.length()-ind==1)
        {
            b=s.substring(ind,ind+1);
        }
        else
        {
            b=s.substring(ind,ind+2);
        }
        int a=Decode(ind+1,s,dp);
        int k=Integer.parseInt(b);
        int c=0;
        if(k<27&&b.length()>1)
        {
         c=Decode(ind+2,s,dp);
        }
        return dp[ind]=a+c;
    }
}