class Solution {
    public String defangIPaddr(String address) {
        StringBuffer str=new StringBuffer();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
                str.append("[.]");
            else
                str.append(address.charAt(i));
        }
     return str.toString();
    }
   
}