class Solution {
    public String convert(String s, int n) {
        if(n==1)
            return s;
        StringBuffer str[]=new StringBuffer[n];
        for(int i=0;i<n;i++)
            str[i]=new StringBuffer();
        int index=0;
        boolean bool=false;
        for(char ch:s.toCharArray()){
            str[index].append(ch);
            if(index==0 || index==n-1){
                bool=!bool;
            }
            index+=bool?1:-1;
        }
        StringBuffer buff=new StringBuffer();
        for(int i=0;i<n;i++){
            buff.append(str[i]);
        }
        return buff.toString();
    }
}