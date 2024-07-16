class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>(); 
        int count=0;
       for(int i=left;i<=right;i++){
        if(fun(i)){
            list.add(i);
        }
       }
       return list;
    }
       public static boolean fun(int n){
        int temp=n;
        while(temp!=0){
        int digit=temp%10;
        if(digit==0 || n%digit!=0)
            return false;
        temp/=10;
       }
       return true;
       }
}