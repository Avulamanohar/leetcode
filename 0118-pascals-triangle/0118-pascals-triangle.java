import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows)
    {  List<List<Integer>> arr=new ArrayList<>();
        int i,j;
        for(i=1;i<=numRows;i++)
        {
                List<Integer> arr1=new ArrayList<>(com(i));
                arr.add(arr1);

        }
        return arr;
       
    }
    public List<Integer> com(int a)
    {          int product=1;
           int i,j;
             List<Integer> arr1=new ArrayList<>();
             arr1.add(1);
             for(j=1;j<a;j++)
             {
                product=product*(a-j);
                product=product/j;
                arr1.add(product);
             }

        return arr1;
    }
}