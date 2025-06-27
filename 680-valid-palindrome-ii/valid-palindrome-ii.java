class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return (palin(i+1,j,s)||(palin(i,j-1,s)));  //elimitate one char i+1 or j-1 
            }
            i++;j--;
        }
        return true;
    }
    public static boolean palin(int i,int j,String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}