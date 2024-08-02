class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        return (str.substring(1,2*s.length()-1).contains(s));
    }
}