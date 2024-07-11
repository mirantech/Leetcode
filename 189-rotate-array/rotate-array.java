class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1); //reverse all the elements(7,6,5,4,3,2,1)
        reverse(nums,0,k-1);//reversre 1st 3 (based on k) (so, rotate (7,6,5) as (5,6,7,1,2,3,4,5)
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int [] nums,int first,int last){
        int temp=0;
        while(first<last){
            temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }

    }
}