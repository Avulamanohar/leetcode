class Solution {
    public List<Integer> getRow(int rowIndex)
    {  
        long row=rowIndex+1;
        List<Integer> arr=new ArrayList<>();
        long i,j;
        long product=1;
        arr.add(1);
        for(i=1;i<row;i++)
        {
            product=product*(row-i);
            product=product/i;
            arr.add((int)product);
        }
        return arr;
    }

}