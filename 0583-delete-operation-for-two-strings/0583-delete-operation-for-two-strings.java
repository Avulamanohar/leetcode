class Solution {
    public int minDistance(String word1, String word2) 
    {
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++)
        {
            for(int j=0;j<word2.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        int a=min(0,0,word1,word2,dp);
        int n=word1.length();
        int m=word2.length();
        return m+n-2*a;
        
    }
    public int min(int i,int j, String s1,String s2,int dp[][])
    {
        if(i==s1.length()||j==s2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=1+min(i+1,j+1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(min(i,j+1,s1,s2,dp),min(i+1,j,s1,s2,dp));
    }
   
}