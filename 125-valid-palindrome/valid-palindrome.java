class Solution {
    public boolean isPalindrome(String s) {
      String str="";
         for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
                str+=s.charAt(i);
        }
        StringBuffer str1=new StringBuffer(str.toLowerCase());
        //System.out.println(str1);
        //System.out.println(str1.reverse());
        if(str1.toString().equals(str1.reverse().toString()))//change buffer to string bcz equals is string class
            return true;
        return false;
            

    }
}