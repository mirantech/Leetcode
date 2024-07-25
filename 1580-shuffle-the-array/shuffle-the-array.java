class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int temp=0;
       for(int i=0;i<n;i++){
        arr[temp]=nums[i];
        temp+=2;
       }
       temp=1;
        for(int i=n;i<nums.length;i++){
            arr[temp]=nums[i];
            temp+=2;
        }
        
        return arr;
    }
}