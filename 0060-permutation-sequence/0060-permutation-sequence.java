class Solution {
    public String getPermutation(int n, int k) 
    {  
     List<Integer> arr=new ArrayList<>();
     int i,j;
     for(i=1;i<=n;i++)
     {
        arr.add(i);
     }
    for(i=1;i<k;i++)
     perm(arr);

   
   int m=arr.size();
   String b="";
   for(i=0;i<m;i++)
   {
    char c=(char)(arr.get(i)+'0');
    b+=c+"";

   }
   return b;

  

    }

    public void perm(List<Integer> arr)
    {
   int i,j;
   List<Integer> arr1=new ArrayList<>(arr);
   List<Integer> arr2=new ArrayList<>();
   List<Integer> arr3=new ArrayList<>();
   int n=arr.size();
   int hari=-1;
   int ind=n-2;
   for(i=n-2;i>=0;i--)
   {
    if(arr.get(i)<arr.get(i+1))
    {

     hari=i;
     ind=i;
     break; 
    }
   }
   if(hari==-1)
{
    Collections.reverse(arr);
    return;
}
   int a=arr.get(ind+1);
     int k=ind+1;
   for(i=ind+1;i<n;i++)
   {
     if(arr.get(i)>arr.get(ind))
     {
        if(a>arr.get(i))
        {
            a=arr.get(i);
            k=i;
        }
     }
   }
  
   Collections.swap(arr,ind,k);

   Collections.sort(arr.subList(ind+1,n));






    }
}