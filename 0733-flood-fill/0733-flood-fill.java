class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color)
    {
        flood(sr,sc,color,image,image[sr][sc]);
       return image;
        
    }
    public void flood(int i,int j,int c,int im[][],int k)
    {
        if(i<0||j<0||i>im.length-1||j>im[0].length-1||im[i][j]!=k)
        {
            return;
        }
        if(im[i][j]==c)
        {
            return;
        }
        im[i][j]=c;
        flood(i+1,j,c,im,k);
        flood(i-1,j,c,im,k);
        flood(i,j+1,c,im,k);
        flood(i,j-1,c,im,k);
    }
}