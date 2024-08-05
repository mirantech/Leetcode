class Solution {
    public String finalString(String s) {
        StringBuffer str=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='i'){
                str.reverse();
            }
            else{
                str.append(ch);
            }
        }
        return String.valueOf(str);
    }
}