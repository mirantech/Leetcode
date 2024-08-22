class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        String str1=s.substring(0,len/2);
        String str2=s.substring(len/2,len);
        int count1=vowels(str1);
        int count2=vowels(str2);
        if(count1==count2)
            return true;
        return false;
    }
    public static int vowels(String str){
        int count=0;
        String v="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(v.contains(str.charAt(i)+"")){
                count+=1;
            }
        }
        return count;
    }
}