import java.util.*;
class Solution {
    public int sumOfUnique(int[] nums) {
        if(nums.length==1)
            return nums[0];
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!set.containsKey(nums[i])){
                set.put(nums[i],1);
            }
            else{
                set.put(nums[i],set.get(nums[i])+1);
            }
        }
        if(set.size()==1){
            return 0;
        }
        int sum=0;
         for(int i=0;i<nums.length;i++){
            if(set.get(nums[i])==1){
                sum+=nums[i];
            }
    }
    return sum;
    }
}