class Solution {
    public int maximum69Number (int num) 
    {
        if(num==99||num==9||num==999||num==9999)
        {
            return num;
        }
        String b=Integer.toString(num);
        char c[]=b.toCharArray();
        for(int i=0;i<c.length;i++)
        {
         if(c[i]=='6')
         {
            c[i]='9';
            break;
         }
        }
        String d=new String(c);
        return Integer.parseInt(d);
        
    }
}