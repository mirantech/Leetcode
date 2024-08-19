class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max=Math.max(word1.length(),word2.length());
        StringBuffer str=new StringBuffer();
        for(int i=0;i<max;i++){
            if(word1.length()-1>=i)
                str.append(word1.charAt(i));
            if(word2.length()-1>=i)
                str.append(word2.charAt(i));
        }
        return str.toString();
    }
}