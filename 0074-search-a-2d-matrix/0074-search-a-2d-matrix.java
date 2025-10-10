class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int k=0;k<n;k++)
        {
            int i=0;
            int j=matrix[0].length-1;
            while(i<=j)
            {
                int mid=i+(j-i)/2;
                if(matrix[k][mid]==target)
                {
                    return true;
                }
                else if(matrix[k][mid]<target)
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }

            }
        }
        return false;
        
    }
}