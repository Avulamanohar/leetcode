class Solution {
    public boolean isHappy(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        while(n!=1)
        {
           String s=Integer.toString(n);
           int k=0;
           for(int i=0;i<s.length();i++)
           {
             int l=s.charAt(i)-'0';
             k+=l*l;
           }
           if(map.containsKey(k))
           {
            return false;
           }
           map.put(k,1);
           n=k;
        }
        return true;
    }
}