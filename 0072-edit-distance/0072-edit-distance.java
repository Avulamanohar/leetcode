class Solution {
    public int minDistance(String word1, String word2) {
        
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++)
        {for(int j=0;j<word2.length();j++)
        {
             dp[i][j]=-1;
        }}
        return Min(0,0,word1,word2,dp);
    }
    public int Min(int i,int j,String s1,String s2,int dp[][])
    {
        if(j==s2.length())
        {
            return s1.length()-i;
        }
        if(i==s1.length())
        {
            return s2.length()-j;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            return Min(i+1,j+1,s1,s2,dp);
        }
        return dp[i][j]=Math.min(1+Min(i+1,j,s1,s2,dp),Math.min(1+Min(i,j+1,s1,s2,dp),1+Min(i+1,j+1,s1,s2,dp)));
        }
    }