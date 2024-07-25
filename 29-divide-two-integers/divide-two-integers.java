class Solution {
    public int divide(int div1, int div2) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
         if(div1==min&&div2==-1){
            return max;
        }
        if(div1<0 || div2<0){
            int ans=div1/div2;
            return ans;
        }
        return Math.abs(div1/div2);
    }
}