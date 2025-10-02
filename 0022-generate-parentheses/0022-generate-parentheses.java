class Solution {
    public List<String> generateParenthesis(int n)
     {
     List<String> s=new ArrayList<>();
     generate(n,n,"",s);
     return s;
        
    }
    public void generate(int ind1,int ind2,String s,List<String> arr)
    {
        if(ind1==0&&ind2==0)
        {
        arr.add(s);
        return;
        }
        if(ind1<0||ind2<0)
        {
            return ;
        }
        String b=s;
        String c=s;
        b+='('+"";
        c+=')'+"";
        generate(ind1-1,ind2,b,arr);
        if(ind1<ind2)
        {
            generate(ind1,ind2-1,c,arr);
        }
    }
}