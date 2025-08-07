class Solution {
    public int countSegments(String s) 
    {int i,j;

    s=s.trim();
        int n=s.length();
    i=0;
    int count=0;
    if(n==0)
    {
    return 0;
    }
    while(i<n)
    {
        j=i;
        while(j<n&&s.charAt(j)!=' ')
        {
            j++;
        }
        while(j<n&&s.charAt(j)==' ')
        {
            j++;
        }
        i=j;
        count++;
        if(i>=n)
        {
            break;

        }


    }
    return count;
        
    }
}