class Solution {
    public List<List<String>> partition(String s)
    {
        List<String> arr=new ArrayList<>();
        List<List<String>> arr1=new ArrayList<>();
        part(s,arr,arr1);
        return arr1;
    }
    public void part(String s,List<String> arr,List<List<String>> arr1)
    {
        if(s.isEmpty())
        {
         arr1.add(new ArrayList<>(arr));
         return;
        }
        for(int i=0;i<s.length();i++)
        {
            String f=s.substring(0,i+1);
            if(b(f))
            {
                arr.add(f);
                part(s.substring(i+1),arr,arr1);
                arr.remove(arr.size()-1);
            }

        }
    }
    public boolean b(String s)
    {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}