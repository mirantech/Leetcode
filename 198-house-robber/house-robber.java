class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];  // startwith 1;
        Arrays.fill(dp,-1);
        return help(nums,nums.length,dp);
    }
    public static int help(int nums[],int len,int dp[]){
        if(len<=0)
            return 0;
        if(dp[len]!=-1){
            return dp[len];
        }
        int pick=nums[len-1]+help(nums,len-2,dp);
        int notPic=0+help(nums,len-1,dp);
        return dp[len]=Math.max(pick,notPic);
    }
}