class Solution {
    public boolean checkValidString(String s)
    { Boolean dp[][]=new Boolean[s.length()+1][s.length()+1];
    
       return check(0,s,0,dp);
    }
    public boolean check(int ind,String s,int sum,Boolean dp[][])
    {
        if(sum<0)
        {
            return false;
        }
        if(ind==s.length())
        {
           if(sum==0)
           {return true;}
           else
           {
           return false;
           }
        }
        if(dp[ind][sum]!=null)
        {
            return dp[ind][sum];
        }
        boolean a;
        if(s.charAt(ind)=='(')
        {
            a= check(ind+1,s,sum+1,dp);
        }
        else if(s.charAt(ind)==')')
        {
            a= check(ind+1,s,sum-1,dp);
        }
        else
        {
            a=check(ind+1,s,sum-1,dp)||check(ind+1,s,sum+1,dp)||check(ind+1,s,sum,dp);
        }
return dp[ind][sum]=a;
    }
}