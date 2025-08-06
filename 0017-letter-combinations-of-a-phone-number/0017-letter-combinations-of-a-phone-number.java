class Solution {
    public List<String> letterCombinations(String digits)
    {
        Map<Character,String> hs=Map.of(
            '2',"abc",
            '3',"def",
            '4',"ghi",
            '5',"jkl",
            '6',"mno",
            '7',"pqrs",
            '8',"tuv",
            '9',"wxyz"
            );
        List<String> ar=new ArrayList<>();

        if(digits.length()==0)
        {
            return ar;
        }
        List<Character> cr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        phone(0,hs,digits,ar,sb);
        return ar;

        
        
    }
    public void phone(int Index,Map<Character,String> hs,String b,List<String> ar,StringBuilder sb)
    {  
         int i,j;
        int n=b.length();
          if(Index==b.length())
        {
         ar.add(sb.toString());
         return;
        }
        
       
        char num=b.charAt(Index);
        String s=hs.get(num);
        int Str=s.length();
      
        for(i=0;i<Str;i++)
        {
        sb.append(s.charAt(i));
         phone(Index+1,hs,b,ar,sb);
         sb.deleteCharAt(sb.length()-1);
        }
    }
   

        
     }