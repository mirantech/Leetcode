class Solution {
    public String restoreString(String s, int[] arr) {
        char str[]=new char[s.length()];
        for(int i=0;i<arr.length;i++){
            str[arr[i]]=s.charAt(i);
        }
        return String.valueOf(str);
    }
}