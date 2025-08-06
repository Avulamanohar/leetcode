class Solution {
    public String intToRoman(int num) 
    {
            List<Integer> arr=new ArrayList<>();
            List<String> arr1=new ArrayList<>();
            arr.add(1000);
            arr.add(900);
            arr.add(500);
            arr.add(400);
            arr.add(100);
            arr.add(90);
            arr.add(50);
            arr.add(40);
            arr.add(10);
            arr.add(9);
            arr.add(5);
            arr.add(4);
            arr.add(1);
            arr1.add("M");
            arr1.add("CM");
            arr1.add("D");
            arr1.add("CD");
            arr1.add("C");
            arr1.add("XC");
            arr1.add("L");
            arr1.add("XL");
            arr1.add("X");
            arr1.add("IX");
            arr1.add("V");
            arr1.add("IV");
            arr1.add("I");
            int i;
            int n=arr.size();
            StringBuilder sb=new StringBuilder();
        
            for(i=0;i<n;i++)
            {
                while(num>=arr.get(i))
                {StringBuilder k=new StringBuilder(arr1.get(i));
                 sb.append(k);
                    num=num-arr.get(i);
                }
            }
               
            return sb.toString();



            
        
    }
}