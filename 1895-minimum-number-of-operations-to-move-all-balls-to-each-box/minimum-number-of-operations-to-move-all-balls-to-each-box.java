class Solution {
    public int[] minOperations(String s) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=add(i,s.length(),s);
        }
        return arr;
    }
    public static int add(int strt,int end,String s){
        int ans=0;
        for(int k=0;k<end;k++){
            if(strt!=k && s.charAt(k)=='1'){
                ans+=Math.abs(strt-k);
            }
        }
        return ans;
    }
}