class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        if(len<2){
            return len;
        }
        int ans=1;
        int count=1;
        for(int i=1;i<len;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
           if(nums[i]==nums[i-1]+1){
                ans=Math.max(ans,++count);
            }
            else{
                count=1;
            }
        }
        return ans;
    }
}