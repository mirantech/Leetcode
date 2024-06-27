class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int ans[]=new int[len+len];
        int j=0;
        for(int i=0;i<len;i++){
            ans[i]=nums[i];
        }
        for(int i=len;i<len*2;i++){
            ans[i]=nums[j];
            j++;
        }
        return ans;
    }
}