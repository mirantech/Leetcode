class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length==1){
            return new int[]{0};
        }
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        leftAdd(left,nums,nums.length);
        rightAdd(right,nums,nums.length);
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
    public static int[] leftAdd(int left[],int nums[],int len){
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        return left;
    }
    public static int[] rightAdd(int right[],int nums[],int len){
        right[len-1]=0;
        for(int i=len-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        return right;
    }
}