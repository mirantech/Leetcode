class Solution {
    public boolean validPalindrome(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return (palin(i+1,j,ch)||(palin(i,j-1,ch)));  //elimitate one char i+1 or j-1 
            }
            i++;j--;
        }
        return true;
    }
    public static boolean palin(int i,int j,char[] arr){
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}