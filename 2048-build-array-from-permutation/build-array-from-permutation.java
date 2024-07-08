class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        arr[i]=nums[nums[i]];
        }
         for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
        }
        return nums;
    }
}