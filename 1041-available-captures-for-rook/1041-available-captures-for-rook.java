class Solution {
    public int numRookCaptures(char[][] board) {
        int a=0;
        int b=0;
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='R')
                {
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        int count=0;
        for(int i=a+1;i<m;i++)
        {
            if(board[i][b]=='p')
            {
                count++;
                break;
            }
            if(board[i][b]!='.')
           {
            break;
           }
            
        }
         for(int i=b+1;i<n;i++)
        {
            if(board[a][i]=='p')
            {
                count++;
                break;
            }
            if(board[a][i]!='.')
           {
            break;
           }
            
        }
         for(int i=a-1;i>=0;i--)
        {
            if(board[i][b]=='p')
            {
                count++;
                break;
            }
            if(board[i][b]!='.')
           {
            break;
           }
            
        }
         for(int i=b-1;i>=0;i--)
        {
            if(board[a][i]=='p')
            {
                count++;
                break;
            }
            if(board[a][i]!='.')
           {
            break;
           }
            
        }
        return count;
        
    }
}