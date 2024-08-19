class Solution {
    public String reverseVowels(String s) {
        StringBuffer str=new StringBuffer(s);
        char temp;
        int i=0;
        int j=s.length()-1;
        String v="aeiouAEIOU";
        while(i<j){
            if(v.contains(String.valueOf(str.charAt(i))))
            {
                if(v.contains(String.valueOf(str.charAt(j)))){
                    temp=str.charAt(i);
                    str.setCharAt(i,str.charAt(j));
                    str.setCharAt(j,temp);
                    j--;       //if both i and j vowels means swap and i++ and j--
                    i++;
                }
                else{
                    j--;  // If j has no vowels means j--;
                }
            }
            else
                i++;     // If i has no vowels means i++;
        }
        return new String(str);
    }
}