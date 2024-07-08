import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int result = 0; // Initialize result to 0
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                if (count == 1) {
                    result = nums[i];
                    break;
                }
                count = 0;
            }
        }
        return result;
    }
}
