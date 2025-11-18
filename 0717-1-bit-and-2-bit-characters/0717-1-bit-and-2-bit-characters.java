class Solution {
    public boolean isOneBitCharacter(int[] bits) 
    {
        int n=bits.length;
        if(n==1)
        {
            if(bits[0]==0)
            {
                return true;
            }
            else 
            {
             return   false;
            }
        }
 
     
      int f=-1;
      int i=0;
      while(i<n)
      {
        
       if(bits[i]==1)
       {
        i=i+2;
       }
       else
       {
        i++;
       }
       if(i<n)
       {f=i;}

      }


if(f==n-1)
{
    return true;
}
return false;
      
    }
}