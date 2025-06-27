class Solution {
    public boolean validPalindrome(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return (palin(i,j,ch)||(palin(j,i,ch)));
            }
            i++;j--;
        }
        return true;
    }
    public static boolean palin(int delete,int con,char[] arr){
        String str=new String(arr);
        StringBuffer buff=new StringBuffer(str);
        buff.deleteCharAt(delete);
        if((buff+"").equals(buff.reverse()+"")){
            return true;
        }
        return false;
    }
}